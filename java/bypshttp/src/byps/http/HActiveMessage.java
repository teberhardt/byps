package byps.http;
/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import byps.BException;
import byps.BExceptionC;

public class HActiveMessage {
  private final static Logger log = LoggerFactory.getLogger(HActiveMessage.class);
  
  final Long messageId;
  
  private boolean waitingForRequestContext;
  private HRequestContext rctxtMessage;
//  private HashMap<Long, BContentStream> incomingStreams;
//  private HashMap<Long, BContentStream> outgoingStreams;
  private ArrayList<Long> incomingStreams = new ArrayList<Long>();
  private Thread workerThread;
  private volatile boolean canceled;
  private volatile String sessionId;
  private AtomicLong cleanupAtMillis = new AtomicLong(0L);

  HActiveMessage(Long messageId) {
    this.messageId = messageId;
    this.waitingForRequestContext = true;
  }

  public boolean isCanceled() {
    return canceled;
  }
  
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionid(String s) {
    sessionId = s;
  }
  
  public boolean queryCleanup() {
    boolean ret = false;
    long ms = cleanupAtMillis.get();
    if (ms != 0) {
      ret = ms < System.currentTimeMillis();
    }
    else if (isCanceled() || isFinished()) { // just to make sure that I never forget to cleanup a message,
      // cleanupAtMillis should already be set if the message is finished 
      cleanupAtMillis.compareAndSet(0, System.currentTimeMillis() + HConstants.KEEP_MESSAGE_AFTER_FINISHED);
    }
    return ret;
  }
  
  public synchronized boolean isLongPoll() {
    return workerThread == null && rctxtMessage != null;
  }
  
  public synchronized Thread getWorkerThread() {
    return workerThread;
  }

  public synchronized void setRequestContext(HRequestContext rctxt, Thread workerThread) {
    this.waitingForRequestContext = false;
    this.rctxtMessage = rctxt;
    
    // workerThread is null for messages that poll processing status.
    // BYPS-9: Avoid socket exception while uploading large files.
    if (workerThread != null) {
      this.workerThread = workerThread;
    }
    
    // Mglw. wartet ein Thread in getAndRemoveRequestContext
    this.notifyAll();
    
    if (log.isDebugEnabled()) log.debug("assigned rctxt=" + rctxt + ", workerThread=" + workerThread);
  }
  
  public synchronized void addIncomingStream(Long streamId) throws BException {
    if (isCanceled()) {
      if (log.isDebugEnabled()) log.debug("Message was canceled");
      throw new BException(BExceptionC.CANCELLED, "Message was canceled");
    }
    if (isFinished()) {
      if (log.isDebugEnabled()) log.debug("Message was finished");
      throw new BException(BExceptionC.CANCELLED, "Message was finished");
    }
    
    if (log.isDebugEnabled()) log.debug("add incoming stream " + streamId);
    incomingStreams.add(streamId);
  }
  
  public synchronized void removeAllIncomingStreams() {
    incomingStreams.clear();
    checkFinished();
  }
  
  private static ArrayList<Long> evalM1AndM2(Collection<Long> m1, Collection<Long> m2) {
    ArrayList<Long> arr = new ArrayList<Long>();
    for (Long streamId : m1) {
      if (m2.contains(streamId)) arr.add(streamId);
    }
    return arr;
  }
  
  public synchronized boolean checkReferencedStreamIds(HashSet<Long> allStreamIds, HashSet<Long> referencedStreamIds) {
    incomingStreams = evalM1AndM2(incomingStreams, allStreamIds);
    referencedStreamIds.addAll(incomingStreams);
    checkFinished();
    return isFinished();
  }

  public synchronized boolean isFinished() {
    boolean finished = !waitingForRequestContext && rctxtMessage == null;
    return finished;
  }

  private void checkFinished() {
  }
  
  public synchronized HRequestContext getAndRemoveRequestContext(HRemoveMessageControl removeControl) throws BException {
    if (log.isDebugEnabled()) log.debug("getAndRemoveRequestContext(" + messageId + ", " + removeControl);

    // Request should be completed?
    if (removeControl == HRemoveMessageControl.FINISHED) {
      
      // Maybe wait some seconds until a RequestContext is available.
      // It is  missing at this point, if a BExceptionC#PROCESSING has occurred and the 
      // client has not jet send a follow-up message.
      
      long timeoutAtMillis = System.currentTimeMillis() + HConstants.INCOMING_STREAM_TIMEOUT_MILLIS;
      while (waitingForRequestContext && rctxtMessage == null && System.currentTimeMillis() < timeoutAtMillis) {
        if (log.isDebugEnabled()) log.debug("Wait for HRequestContext...");
        try {
          this.wait(1000L);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          if (log.isDebugEnabled()) log.debug("Interrupted while waiting for HRequestContext");
          break;
        }
      }
      if (log.isDebugEnabled()) log.debug("Continue with rctxt=" + rctxtMessage);
    }
    
    HRequestContext rctxt = rctxtMessage;
    rctxtMessage = null;
    
    // If the server still works on the message, we keep the HActiveMessage object  
    // alive by setting waitingForRequestContext=true. 
    // When the client sends the follow-up message, its RequestContext is assigned
    // to this message.
    // BYPS-9: Avoid socket exception while uploading large files.
    waitingForRequestContext = removeControl == HRemoveMessageControl.PROCESSING;

    checkFinished();

    if (log.isDebugEnabled()) log.debug(")getAndRemoveRequestContext=" + rctxt);
    return rctxt;
  }

  public synchronized void removeWorker() {
    if (log.isDebugEnabled()) log.debug("removeWorker(" + messageId);
    workerThread = null;
    cleanupAtMillis.compareAndSet(0, System.currentTimeMillis() + HConstants.KEEP_MESSAGE_AFTER_FINISHED);
    checkFinished();
    if (log.isDebugEnabled()) log.debug(")removeWorker");
  }

  public synchronized void cancelMessage() {
    if (log.isDebugEnabled()) log.debug("cancelMessage(" + messageId);

    canceled = true;
    cleanupAtMillis.compareAndSet(0, System.currentTimeMillis() + HConstants.KEEP_MESSAGE_AFTER_FINISHED);
    
    // Threads might wait in getIncomingStream()
    this.notifyAll();

    Thread thread = workerThread;
    if (log.isDebugEnabled()) log.debug("worker is still running: " + (thread != null));
    if (thread != null) {
      
      // Do not cancel the current thread. Otherwise, BSkeleton_BUtilityRequests.cancelMessage
      // cannot send its response to the client.  
      if (thread != Thread.currentThread()) {
        
        if (log.isDebugEnabled()) log.debug("interrupt thread=" + thread);
        thread.interrupt();

        // The worker thread will call RequestContext.complete
        // when it is finished.
      }
      
    }
    else if (rctxtMessage != null) {

      if (log.isDebugEnabled()) log.debug("assume long-poll, complete response with HTTP 410");

      // Assume Longpoll request because a worker thread would have called
      // getAndRemoveRequestContext
      // before it has called removeWorker.

      // This block is executed, if the session is invalidated.
      // The response code is SC_GONE in order to stop HServerR on the
      // client side from
      // sending a new long-poll.

      HttpServletResponse resp = (HttpServletResponse) rctxtMessage.getResponse();
      resp.setStatus(HttpServletResponse.SC_GONE);
      rctxtMessage.complete();
      rctxtMessage = null;
    }

    incomingStreams.clear();
    
    checkFinished();
    
    if (log.isDebugEnabled()) log.debug(")cancelMessage");
  }

  @Override
  public String toString() {
    StringBuilder sbuf = new StringBuilder();
    sbuf.append("[").append(messageId);
    if (workerThread != null) sbuf.append(",").append(workerThread.getName());
    if (canceled) sbuf.append(",canceled");
    if (cleanupAtMillis.get() != 0) sbuf.append(",cleanupAt=" + new Date(cleanupAtMillis.get()));
    sbuf.append("]");
    return sbuf.toString();
  }

}

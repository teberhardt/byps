package byps.http;
/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
import javax.servlet.AsyncListener;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HSyncContext implements HRequestContext {
	
	private ServletRequest request;
	private ServletResponse response;
	
	public HSyncContext(ServletRequest request, ServletResponse response) {
		this.request = request;
		this.response = response;
	}

	@Override
	public void addListener(AsyncListener lsn) {
	}

	@Override
	public void complete() {
	}

	@Override
	public ServletRequest getRequest() {
		return request;
	}

	@Override
	public ServletResponse getResponse() {
		return response;
	}

	@Override
	public void setTimeout(long arg0) {
	}

	@Override
	public void start(Runnable arg0) {
		arg0.run();
	}

	@Override
	public boolean isAsync() {
		return false;
	}
}

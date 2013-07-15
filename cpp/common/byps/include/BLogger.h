#ifndef BLOGGER_H_
#define BLOGGER_H_


#include <fstream>

namespace com { namespace wilutions { namespace byps {

enum BLogLevel {
	Nothing, Debug, Info, Warn, Error
};

class BLogFile {
public:
	BLogFile();

#ifdef BFSTREAM_WCHAR
	void open(const std::wstring& fname, BLogLevel level, bool append);
#endif

    void open(const std::string& fname, BLogLevel level, bool append);

	void close();
	void println(BLogLevel msglevel, const std::wstring& msg);

	BLogLevel level;

private:
	std::wfstream strm;
};

class BLogStream {
public:
	BLogStream(BLogLevel level, const char* className, int line);
	BLogStream(const BLogStream& rhs);
	~BLogStream();
	std::basic_ostream<wchar_t>& operator << (const std::wstring& msg);
	std::basic_ostream<wchar_t>& operator << (const char* msg);
	std::basic_ostream<wchar_t>& operator << (const std::string& msg);
private:
	bool print;
	BLogLevel level;
	std::wstringstream ss;
};

class BLogger {
public:
	BLogger(const char* className);

	bool isDebugEnabled();
	bool isInfoEnabled();
	bool isWarnEnabled();
	bool isErrorEnabled();

	BLogStream debug(int line = 0);
	BLogStream info(int line = 0);
	BLogStream warn(int line = 0);
	BLogStream error(int line = 0);

#ifdef BFSTREAM_WCHAR
    static void init(const std::wstring& fname, BLogLevel level, bool append = false);
#endif
    static void init(const std::string& fname, BLogLevel level, bool append = false);
    static void done();

	static BLogFile logFile;
	const char* className;
};

#define LOGGER_IMPL \
	namespace com { namespace wilutions { namespace byps {\
		BLogFile BLogger::logFile;\
	}}}

std::basic_ostream<wchar_t>& operator << (std::basic_ostream<wchar_t>& , const char* msg);
std::basic_ostream<wchar_t>& operator << (std::basic_ostream<wchar_t>& , const std::string& msg);
std::basic_ostream<wchar_t>& operator << (std::basic_ostream<wchar_t>& ss, const std::exception& ex);

}}}

#ifndef l_debug
#define l_debug if (log.isDebugEnabled()) log.debug(__LINE__)
#endif
#ifndef l_info
#define l_info if (log.isInfoEnabled()) log.info(__LINE__)
#endif
#ifndef l_warn
#define l_warn if (log.isWarnEnabled()) log.warn(__LINE__)
#endif
#ifndef l_error
#define l_error if (log.isErrorEnabled()) log.error(__LINE__)
#endif

#endif

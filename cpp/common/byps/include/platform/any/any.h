#ifndef BANY_CPU_H_
#define BANY_CPU_H__

///////////////////////////////////////////////////////////////////////////////
// Include shared pointer etc. from BOOST library

#ifndef BSTD_SYMBOLS
#define BSTD_SYMBOLS

#if __GNUC__
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wpointer-arith"
#endif

#include <boost/shared_ptr.hpp>

#if __GNUC__
#pragma GCC diagnostic pop
#endif

#define byps_ptr boost::shared_ptr
#define byps_weak_ptr boost::weak_ptr
#define byps_ptr_cast boost::dynamic_pointer_cast
#define byps_static_ptr_cast boost::static_pointer_cast
#define byps_enable_shared_from_this boost::enable_shared_from_this

#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wmissing-field-initializers"
#include <boost/thread/shared_mutex.hpp>
#define byps_mutex boost::shared_mutex
#pragma GCC diagnostic pop

#endif // BSTD_SYMBOLS

///////////////////////////////////////////////////////////////////////////////
// Define bitswap functions.

#ifndef BSWAP_FUNCTIONS
#define BSWAP_FUNCTIONS

namespace com { namespace wilutions { namespace byps {

inline int16_t BSWAP2(register int16_t v) {
	return ((v & 0xFF) << 8) | ((v >> 8) & 0xFF);
}

inline int32_t BSWAP4(register int32_t v) {
	return ((v & 0xFF) << 24) |
			((v & 0xFF00) << 8) |
			((v & 0xFF0000) >> 8) |
			((v & 0xFF000000) >> 24);
}

inline int64_t BSWAP8(register int64_t v) {
	return ((v & 0xFF) << 56) |
			((v & 0xFF00) << 40) |
			((v & 0xFF0000) << 24) |
			((v & 0xFF000000) << 8) |
			((v & 0xFF00000000LL) >> 8) |
			((v & 0xFF0000000000LL) >> 24) |
			((v & 0xFF000000000000LL) >> 40) |
			((v & 0xFF00000000000000LL) >> 56);
}

}}}

#endif // BSWAP_FUNCTIONS

///////////////////////////////////////////////////////////////////////////////
// Define functions to serialize floating point types in IEEE format.

#ifndef BFLOAT_IEEE_FUNCTIONS
#define BFLOAT_IEEE_FUNCTIONS

namespace com { namespace wilutions { namespace byps {

union float_int32_t {
	float f;
	int32_t i;
};

inline int32_t floatToIEEE(float v) {
	float_int32_t fi;
	fi.f = v;
	return fi.i;
}

inline float floatFromIEEE(int32_t v) {
	float_int32_t fi;
	fi.i = v;
	return fi.f;
}

union double_int64_t {
	double f;
	int64_t i;
};

inline int64_t doubleToIEEE(double v) {
	double_int64_t fi;
	fi.f = v;
	return fi.i;
}

inline double doubleFromIEEE(int64_t v) {
	double_int64_t fi;
	fi.i = v;
	return fi.f;
}

}}}

#endif /* BFLOAT_IEEE_FUNCTIONS */

///////////////////////////////////////////////////////////////////////////////
// Define functions to serialize integers to unaligned memory adresses.

#ifndef BSERIALIZE_UNALIGNED_FUNCTIONS
#define BSERIALIZE_UNALIGNED_FUNCTIONS

namespace com { namespace wilutions { namespace byps {

template<typename _int163264> void writeUnalignedInt163264(void* p, _int163264& v) {
	memcpy(p, &v, sizeof(_int163264));
}
template<typename _int163264> void readUnalignedInt163264(void* p, _int163264& v) {
	memcpy(&v, p, sizeof(_int163264));
}

}}}

#endif // BSERIALIZE_UNALIGNED_FUNCTIONS

#endif // BANY_CPU_H__
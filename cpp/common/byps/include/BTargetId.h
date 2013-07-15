#ifndef BTargetId_H_
#define BTargetId_H_

#include "Byps.h"

namespace com { namespace wilutions { namespace byps {

class BBuffer;

class BTargetId
{
    int64_t v1;
    int64_t v2;

public:
    BTargetId();

    BTargetId(int64_t v1, int64_t v2);

    bool isZero();

    void serialize(BBuffer& bbuf);

    bool operator == (const BTargetId& rhs) const;

	static BTargetId parseString(const char* sz, size_t len);

private:
	

};

}}}


#endif
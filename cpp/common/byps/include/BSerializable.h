#ifndef BSERIALIZABLE_H_
#define BSERIALIZABLE_H_

#include "Byps.h"

namespace com { namespace wilutions { namespace byps {

class BSerializable {
public:
    virtual ~BSerializable() {}
	virtual BTYPEID BSerializable_getTypeId() = 0;
};


}}}

#endif /* BSERIALIZABLE_H_ */

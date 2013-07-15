/*
 * BInput.h
 *
 *  Created on: 29.07.2012
 *      Author: Wolfgang
 */

#ifndef BINPUT_H_
#define BINPUT_H_

#include "Byps.h"

namespace com { namespace wilutions { namespace byps {

class BInput : public BIO {
public:
    BMessageHeader header;

    BInput(PTransport transport, const BMessageHeader& header, PBytes& pBytes);

    virtual ~BInput();

    PSerializable load();

protected:
	 
    typedef std::unordered_map<BPOINTER, POBJECT > IDMAP;
    IDMAP idMap;
    BPOINTER currentId;

    virtual void internalLoadObj(POBJECT&);
    virtual void internalLoadObjS(PSerializable&);
    
};


}}}

#endif /* BINPUT_H_ */

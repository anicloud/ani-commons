package com.ani.commons.octopus.object.dto.objstub;

import com.ani.commons.octopus.objmeta.stub.dto.StubInvokeDto;

import java.util.List;

/**
 * Created by yeh on 15-11-12.
 */
public class ObjectMainStubDto extends ObjectStubDto{

    public List<StubInvokeDto> stubs;

    public ObjectMainStubDto() {
        super();
    }

    public ObjectMainStubDto(Long objectMainId, List<StubInvokeDto> stubs) {
        super(objectMainId);
        this.stubs = stubs;
    }

    public ObjectMainStubDto(Long objectMainId) {
        super(objectMainId);
    }

}

package com.ani.commons.octopus.object.dto.objstub;

import com.ani.commons.octopus.objmeta.stub.dto.StubInvokeDto;

import java.util.List;
import java.util.Map;

/**
 * Created by yeh on 15-11-12.
 */
public class ObjectSlaveStubDto extends ObjectStubDto{

    public Map<Integer, List<StubInvokeDto>> slavesStub;

    public ObjectSlaveStubDto() {
        super();
    }

    public ObjectSlaveStubDto(Long objectMainId, Map<Integer, List<StubInvokeDto>> slavesStub) {
        super(objectMainId);
        this.slavesStub = slavesStub;
    }
}

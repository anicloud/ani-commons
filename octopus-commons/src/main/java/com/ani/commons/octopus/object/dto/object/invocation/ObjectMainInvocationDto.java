package com.ani.commons.octopus.object.dto.object.invocation;

import com.ani.commons.octopus.objmeta.stub.dto.StubInvokeDto;

import java.util.List;

/**
 * Created by yeh on 15-12-8.
 */
public class ObjectMainInvocationDto extends ObjectInvocationDto {

    public ObjectMainInvocationDto() {}

    public ObjectMainInvocationDto(Long objectMainId, List<StubInvokeDto> invokableStubs) {
        super(objectMainId, invokableStubs);
    }
}

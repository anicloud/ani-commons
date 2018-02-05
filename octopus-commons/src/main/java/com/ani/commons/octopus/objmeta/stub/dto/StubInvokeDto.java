package com.ani.commons.octopus.objmeta.stub.dto;

import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by yeh on 15-10-16.
 */
public class StubInvokeDto extends AniDto{

    public Integer stubGroupId;

    public Integer stubId;

    public List<StubArgumentDto> args;

    public List<StubArgumentDto> outArgs;

    public StubInvokeDto() {}

    public StubInvokeDto(Integer stubGroupId, Integer stubId) {
        this.stubGroupId = stubGroupId;
        this.stubId = stubId;
    }

    public StubInvokeDto(Integer stubGroupId, Integer stubId, List<StubArgumentDto> args, List<StubArgumentDto> outArgs) {
        this.stubGroupId = stubGroupId;
        this.stubId = stubId;
        this.args = args;
        this.outArgs = outArgs;
    }
    
}

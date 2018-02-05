package com.ani.commons.octopus.objmeta.stub.dto;

import com.ani.utils.dto.AniDto;

/**
 * Created by yeh on 15-10-16.
 */
public class StubDto extends AniDto{

    public Integer stubGroupId;

    public Integer stubId;

    public StubDto() {}

    public StubDto(Integer stubGroupId, Integer stubId) {
        this.stubGroupId = stubGroupId;
        this.stubId = stubId;
    }



}

package com.ani.commons.octopus.objmeta.stub.dto;

import com.ani.utils.dto.AniDto;

/**
 * Created by yeh on 15-10-16.
 */
public class StubGroupInfoDto extends AniDto{

    public Integer groupId;

    public String name;

    public StubGroupInfoDto() {
    }

    public StubGroupInfoDto(Integer groupId, String name) {
        this.groupId = groupId;
        this.name = name;
    }

    public StubGroupInfoDto(Integer groupId) {
        this.groupId = groupId;
    }
}

package com.ani.commons.octopus.objmeta.state.dto;

import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by yeh on 17-3-17.
 */
public class StateDto extends AniDto {

    public Long groupId;

    public Integer stateId;

    public StateDto() {
    }

    public StateDto(Long groupId, Integer stateId) {
        this.groupId = groupId;
        this.stateId = stateId;
    }
}

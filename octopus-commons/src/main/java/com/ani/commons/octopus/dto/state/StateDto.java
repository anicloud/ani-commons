package com.ani.commons.octopus.dto.state;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-29.
 */
public class StateDto implements Serializable {

    private static final long serialVersionUID = 2860271919049033154L;

    private Integer groupId;
    private Integer stateId;

    public StateDto(Integer groupId, Integer stateId) {
        this.groupId = groupId;
        this.stateId = stateId;
    }

    public StateDto() {
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }
}

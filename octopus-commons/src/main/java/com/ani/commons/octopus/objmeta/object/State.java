package com.ani.commons.octopus.objmeta.object;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class State implements Serializable {

    private static final long serialVersionUID = -7876899142879104264L;

    private Integer groupId;
    private Integer stateId;
    private List paramsValue;

    public State() {}

    public State(Integer groupId, Integer stateId, List paramsValue) {
        this.groupId = groupId;
        this.stateId = stateId;
        this.paramsValue = paramsValue;
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

    public List getParamsValue() {
        return paramsValue;
    }

    public void setParamsValue(List paramsValue) {
        this.paramsValue = paramsValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.groupId, this.stateId);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof State)) return false;
        State oneSm = (State) obj;
        if (oneSm.groupId == this.groupId && oneSm.stateId == this.stateId)
            return true;
        else
            return false;
    }
}

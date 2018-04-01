package com.ani.commons.octopus.dto.model;

import com.ani.commons.octopus.dto.state.StateDto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-3-29.
 */
public class StateMachineDto implements Serializable {

    private static final long serialVersionUID = -8414209653164796889L;

    Long smId;
    String name;
    List<StateDto> states;

    public StateMachineDto() {
    }

    public StateMachineDto(Long smId, String name, List<StateDto> states) {
        this.smId = smId;
        this.name = name;
        this.states = states;
    }

    public Long getSmId() {
        return smId;
    }

    public void setSmId(Long smId) {
        this.smId = smId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StateDto> getStates() {
        return states;
    }

    public void setStates(List<StateDto> states) {
        this.states = states;
    }

}

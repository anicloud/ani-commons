package com.ani.commons.objmeta.dto.meta;

import com.ani.utils.dto.AniDto;

import java.util.List;

public class StateMachineDto extends AniDto {

    private static final long serialVersionUID = 2868835263164107791L;

    String name;
    List<StateDto> states;

    public StateMachineDto() {
    }

    public StateMachineDto(String name, List<StateDto> states) {
        this.name = name;
        this.states = states;
    }
}

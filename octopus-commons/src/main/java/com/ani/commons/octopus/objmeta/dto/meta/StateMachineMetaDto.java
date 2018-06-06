package com.ani.commons.octopus.objmeta.dto.meta;

import com.ani.utils.core.Operation;
import com.ani.utils.dto.AniRequiredField;

import java.util.List;

public class StateMachineMetaDto extends StateMachineDto {

    private static final long serialVersionUID = -5613854897899899525L;

    private String name;

    public StateMachineMetaDto() {
    }

    public StateMachineMetaDto(List<AniMetaDto> states, Long opAccountId, String name) {
        super(states, opAccountId);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

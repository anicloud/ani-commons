package com.ani.commons.octopus.objmeta.dto.meta;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;
import com.ani.utils.exception.AniRuleException;

import java.util.ArrayList;
import java.util.List;

public abstract class StateMachineDto extends AniDto {

    private static final long serialVersionUID = 2868835263164107791L;

    @AniRequiredField
    private List<AniMetaDto> states;
    @AniRequiredField
    private Long opAccountId;

    public StateMachineDto() {
    }

    public StateMachineDto(Long modelId, List<AniMetaDto> states, Long opAccountId) {
        this.states = states;
        this.opAccountId = opAccountId;
    }

    public List<AniMetaDto> getStates() {
        return states;
    }

    public void setStates(List<AniMetaDto> states) {
        this.states = states;
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

    public List<Long> getStatesLongId() throws AniRuleException {
        if (this.states == null)
            throw new AniRuleException("STATE_MACHINES_ARE_REQUIRED");
        List<Long> statesLongId = new ArrayList<>(this.states.size());
        for (AniMetaDto oneState : this.states) {
            if (oneState == null) continue;
            statesLongId.add(oneState.getLongId());
        }
        return statesLongId;
    }
}

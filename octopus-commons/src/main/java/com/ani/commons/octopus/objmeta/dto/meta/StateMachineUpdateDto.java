package com.ani.commons.octopus.objmeta.dto.meta;

import com.ani.utils.core.Operation;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.util.List;

public class StateMachineUpdateDto extends StateMachineDto {

    private static final long serialVersionUID = -5613854897899899525L;

    @AniRequiredField
    private Integer smIdx;
    @AniRequiredField
    private Operation updateOp;

    public StateMachineUpdateDto() {
    }

    public StateMachineUpdateDto(Long modelId, List<AniMetaDto> states, Long opAccountId, Integer smIdx, Operation updateOp) {
        super(modelId, states, opAccountId);
        this.smIdx = smIdx;
        this.updateOp = updateOp;
    }

    public Integer getSmIdx() {
        return smIdx;
    }

    public void setSmIdx(Integer smIdx) {
        this.smIdx = smIdx;
    }

    public Operation getUpdateOp() {
        return updateOp;
    }

    public void setUpdateOp(Operation updateOp) {
        this.updateOp = updateOp;
    }
}

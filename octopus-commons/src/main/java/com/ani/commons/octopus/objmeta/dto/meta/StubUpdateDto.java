package com.ani.commons.octopus.objmeta.dto.meta;

import com.ani.utils.core.AniGeneralUtils;
import com.ani.utils.core.Operation;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;
import com.ani.utils.exception.AniRuleException;

import java.util.ArrayList;
import java.util.List;

public class StubUpdateDto extends AniDto {

    private static final long serialVersionUID = -5613854897899899525L;

    @AniRequiredField
    private List<AniMetaDto> metasDto;

    @AniRequiredField
    private Operation updateOp;

    public StubUpdateDto() {
    }

    public StubUpdateDto(List<AniMetaDto> metasDto, Operation updateOp) {
        this.metasDto = metasDto;
        this.updateOp = updateOp;
    }

    public List<AniMetaDto> getMetasDto() {
        return metasDto;
    }

    public void setMetasDto(List<AniMetaDto> metasDto) {
        this.metasDto = metasDto;
    }

    public Operation getUpdateOp() {
        return updateOp;
    }

    public void setUpdateOp(Operation updateOp) {
        this.updateOp = updateOp;
    }

    public List<Long> getMetasLongId() throws AniRuleException {
        if(AniGeneralUtils.isCollectionEmpty(this.metasDto))
            throw new AniRuleException("UPDATE_METAS_REQUIRED");
        List<Long> metasId = new ArrayList<>(this.metasDto.size());
        for(AniMetaDto oneDto: metasDto) {
            oneDto.checkFields();
            metasId.add(oneDto.getLongId());
        }
        return metasId;
    }
}

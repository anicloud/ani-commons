package com.ani.commons.earth.dto.op;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

public abstract class OpAuthDto extends AniDto {

    private static final long serialVersionUID = 1074420520031322937L;

    @AniRequiredField
    private Long opAccountId;

    public OpAuthDto() {
    }

    public OpAuthDto(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }
}

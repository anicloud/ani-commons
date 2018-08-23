package com.ani.commons.earth.dto.op;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by changhan on 18-8-19.
 */
public abstract class OpDto extends AniDto {

    @AniRequiredField
    private Long opAccountId;

    public OpDto() {
    }

    public OpDto(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

}
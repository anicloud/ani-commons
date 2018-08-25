package com.ani.commons.earth.dto.op;

import com.ani.utils.dto.AniRequiredField;

public abstract class OpAuthGroupDto extends OpAuthDto {

    private static final long serialVersionUID = 7126397760003418153L;

    @AniRequiredField
    private Long authGroupId;

    public OpAuthGroupDto() {
    }

    public OpAuthGroupDto(Long opAccountId, Long authGroupId) {
        super(opAccountId);
        this.authGroupId = authGroupId;
    }

    public Long getAuthGroupId() {
        return authGroupId;
    }

    public void setAuthGroupId(Long authGroupId) {
        this.authGroupId = authGroupId;
    }
}

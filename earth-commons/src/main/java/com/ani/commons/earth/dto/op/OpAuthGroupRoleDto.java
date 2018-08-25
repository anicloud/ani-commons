package com.ani.commons.earth.dto.op;

import com.ani.utils.dto.AniRequiredField;

public class OpAuthGroupRoleDto extends OpAuthGroupDto {

    private static final long serialVersionUID = 8308727796904129557L;

    @AniRequiredField
    public Long roleGroupId;

    public OpAuthGroupRoleDto() {
    }
}

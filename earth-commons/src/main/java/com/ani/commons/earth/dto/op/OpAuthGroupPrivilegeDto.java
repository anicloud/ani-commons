package com.ani.commons.earth.dto.op;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniRequiredField;

public class OpAuthGroupPrivilegeDto extends OpAuthGroupDto {

    @AniRequiredField
    private PrivilegeType opPrivilege;

    public OpAuthGroupPrivilegeDto() {
    }

    public OpAuthGroupPrivilegeDto(Long opAccountId, Long authGroupId, PrivilegeType opPrivilege) {
        super(opAccountId, authGroupId);
        this.opPrivilege = opPrivilege;
    }

    public PrivilegeType getOpPrivilege() {
        return opPrivilege;
    }

    public void setOpPrivilege(PrivilegeType opPrivilege) {
        this.opPrivilege = opPrivilege;
    }
}

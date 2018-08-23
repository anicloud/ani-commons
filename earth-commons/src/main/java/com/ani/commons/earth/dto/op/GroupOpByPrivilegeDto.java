package com.ani.commons.earth.dto.op;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by changhan on 18-8-22.
 */
public abstract class GroupOpByPrivilegeDto extends GroupOpDto {

    @AniRequiredField
    PrivilegeType privilege;

    public GroupOpByPrivilegeDto() {
    }

    public GroupOpByPrivilegeDto(Long opAccountId, Long privilegeGroupId, PrivilegeType privilege) {
        super(opAccountId, privilegeGroupId);
        this.privilege = privilege;
    }

    public PrivilegeType getPrivilege() {
        return privilege;
    }

    public void setPrivilege(PrivilegeType privilege) {
        this.privilege = privilege;
    }
}

package com.ani.commons.earth.dto.organization.role;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by ebrx on 18-7-26.
 */
public class AccountRoleQueryDto extends AniDto {
    private static final long serialVersionUID = 2658212645942703267L;

    @AniRequiredField
    private Long roleId;
    @AniRequiredField
    private Long ownerId;

    public AccountRoleQueryDto(Long roleId, Long ownerId) {
        this.roleId = roleId;
        this.ownerId = ownerId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long id) {
        this.roleId = roleId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}

package com.ani.commons.earth.dto.organization.role;

import com.ani.commons.earth.dto.op.OpDto;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * Created by changhan on 18-8-24.
 */
public abstract class RoleAdminOpDto extends OpDto{

    @JsonSerialize(using = ToStringSerializer.class)
    private Long roleId;

    public RoleAdminOpDto() {
    }

    public RoleAdminOpDto(Long opAccountId, Long roleXId) {
        super(opAccountId);
        this.roleId = roleId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}

package com.ani.commons.earth.dto.organization.role;

import com.ani.utils.core.data.type.PrivilegeType;

import java.util.Set;

/**
 * Created by changhan on 18-8-24.
 */
public class RolePrivilegeUpdateDto extends RoleAdminOpDto {

    private Set<PrivilegeType> privileges;

    public RolePrivilegeUpdateDto() {
    }

    public RolePrivilegeUpdateDto(Long opAccountId, Long roleId, Set<PrivilegeType> privileges) {
        super(opAccountId, roleId);
        this.privileges = privileges;
    }

    public Set<PrivilegeType> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Set<PrivilegeType> privileges) {
        this.privileges = privileges;
    }
}

package com.ani.commons.earth.dto.organization.role;

import com.ani.utils.core.data.type.PrivilegeType;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.Set;

/**
 * Created by zhanglina on 18-7-25.
 */
public class AccountRoleDto extends RoleAdminOpDto {

    private static final long serialVersionUID = -1532531020505464389L;

    @JsonSerialize(using = ToStringSerializer.class)
    private Long ownerAccountId;

    private String name;

    private Set<PrivilegeType> privileges;

    public AccountRoleDto() {
    }

    public AccountRoleDto(Long opAccountId, Long roleId, Long ownerAccountId, String name, Set<PrivilegeType> privileges) {
        super(opAccountId, roleId);
        this.ownerAccountId = ownerAccountId;
        this.name = name;
        this.privileges = privileges;
    }

    public Long getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PrivilegeType> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Set<PrivilegeType> privileges) {
        this.privileges = privileges;
    }
}

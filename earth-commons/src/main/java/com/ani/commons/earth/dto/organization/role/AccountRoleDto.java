package com.ani.commons.earth.dto.organization.role;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniDto;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.Set;

/**
 * Created by zhanglina on 18-7-25.
 */
public class AccountRoleDto extends AniDto {

    private static final long serialVersionUID = -1532531020505464389L;
    @JsonSerialize(using= ToStringSerializer.class)
    private Long roleId;
    @JsonSerialize(using= ToStringSerializer.class)
    private Long ownerId;
    private String name;
    private Set<PrivilegeType> privileges;

    public AccountRoleDto() {
    }

    public AccountRoleDto(Long roleId, Long ownerId, String name, Set<PrivilegeType> privileges) {
        this.roleId = roleId;
        this.ownerId = ownerId;
        this.name = name;
        this.privileges = privileges;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Set<PrivilegeType> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Set<PrivilegeType> privileges) {
        this.privileges = privileges;
    }
}

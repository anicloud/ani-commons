package com.ani.commons.earth.domain.role;


import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniDto;
import java.util.Set;

/**
 * Created by ebrx on 18-7-26.
 */
public class AccountRole extends AniDto {
    private static final long serialVersionUID = 2835983517461985839L;
    private Long roleId;
    private Long ownerId;
    private String name;
    private Set<PrivilegeType> privileges;

    public AccountRole() {
    }

    public AccountRole(Long roleId, Long ownerId, String name, Set<PrivilegeType> privileges ) {
        this.roleId = roleId;
        this.ownerId = ownerId;
        this.name = name;
        this.privileges = privileges;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long id) {
        this.roleId = id;
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

    public Set<PrivilegeType> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Set<PrivilegeType> privileges) {
        this.privileges = privileges;
    }

}

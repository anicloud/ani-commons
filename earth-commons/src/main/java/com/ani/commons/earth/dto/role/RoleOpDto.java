package com.ani.commons.earth.dto.role;

import java.io.Serializable;

/**
 * Created by changhan on 18-8-9.
 */
public class RoleOpDto implements Serializable {
    private static final long serialVersionUID = -6451233297556820075L;
    private Long roleId;
    private String name;

    public RoleOpDto(Long roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }

    public RoleOpDto() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

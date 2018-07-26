package com.ani.commons.earth.dto.organization.role;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by zhanglina on 18-7-25.
 */
public class AccountRoleDto extends AniDto {

    private static final long serialVersionUID = -1532531020505464389L;

    private Long id;
    private Long ownerId;
    private String name;
    private PrivilegeType privileges;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public PrivilegeType getPrivileges() {
        return privileges;
    }

    public void setPrivileges(PrivilegeType privileges) {
        this.privileges = privileges;
    }

}

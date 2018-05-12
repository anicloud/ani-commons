package com.ani.commons.earth.domain.organization.account;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.core.data.type.TransparencyType;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by zhanglina on 18-5-2.
 */
public class RolePrivilege implements Serializable {

    private static final long serialVersionUID = -5114282528582743225L;

    private Long id;
    private TransparencyType transparencyType;
    private Set<PrivilegeType> privilegeTypes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransparencyType getTransparencyType() {
        return transparencyType;
    }

    public void setTransparencyType(TransparencyType transparencyType) {
        this.transparencyType = transparencyType;
    }

    public Set<PrivilegeType> getPrivilegeTypes() {
        return privilegeTypes;
    }

    public void setPrivilegeTypes(Set<PrivilegeType> privilegeTypes) {
        this.privilegeTypes = privilegeTypes;
    }

    public RolePrivilege() {
    }
}

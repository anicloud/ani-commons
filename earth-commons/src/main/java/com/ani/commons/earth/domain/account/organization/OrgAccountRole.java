package com.ani.commons.earth.domain.account.organization;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.core.data.type.TransparencyType;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OrgAccountRole implements Serializable {

    private static final long serialVersionUID = 1923829703545762045L;

    private Long id;

    private String name;

    private Map<TransparencyType, Set<PrivilegeType>> privileges;
//    private List<RolePrivilege> privileges;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Map<TransparencyType, Set<PrivilegeType>> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Map<TransparencyType, Set<PrivilegeType>> privileges) {
        this.privileges = privileges;
    }
}

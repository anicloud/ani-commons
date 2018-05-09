package com.ani.commons.bus.earth.domain.organization.tree;

import com.ani.utils.core.data.type.PrivilegeType;

import java.util.Set;

/**
 * Created by zhanglina on 18-5-7.
 */
public class NodeMemberPrivilege {
    private Long nodeId;
    private Long employeeId;
    private Set<PrivilegeType> privileges;
    private Set<PrivilegeType> generationsPrivileges;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Set<PrivilegeType> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Set<PrivilegeType> privileges) {
        this.privileges = privileges;
    }

    public Set<PrivilegeType> getGenerationsPrivileges() {
        return generationsPrivileges;
    }

    public void setGenerationsPrivileges(Set<PrivilegeType> generationsPrivileges) {
        this.generationsPrivileges = generationsPrivileges;
    }
}

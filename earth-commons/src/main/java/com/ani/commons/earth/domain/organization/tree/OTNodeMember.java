package com.ani.commons.earth.domain.organization.tree;

import com.ani.utils.core.DataState;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OTNodeMember implements Serializable{

    private static final long serialVersionUID = 7390072708419356754L;

    private String roleName;

    private Long employeeId;

    private String employeeNum;

    private String name;

    private DataState state;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public Long getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataState getState() {
        return state;
    }

    public void setState(DataState state) {
        this.state = state;
    }
}

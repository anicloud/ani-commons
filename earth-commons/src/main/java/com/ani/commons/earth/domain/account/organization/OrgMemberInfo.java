package com.ani.commons.earth.domain.account.organization;


import com.ani.utils.core.DataState;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-11.
 */
public class OrgMemberInfo implements Serializable{
    private static final long serialVersionUID = 6395031521628568782L;
    private Long employeeId ;
    private Integer employeeCount;
    private String name;
    private String employeeStrId;
    private String phone;
    private DataState state;

    public OrgMemberInfo() {
    }

    public OrgMemberInfo(Long employeeId, Integer employeeCount, String name, String employeeStrId, String phone, DataState state) {
        this.employeeId = employeeId;
        this.employeeCount = employeeCount;
        this.name = name;
        this.employeeStrId = employeeStrId;
        this.phone = phone;
        this.state = state;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeStrId() {
        return employeeStrId;
    }

    public void setEmployeeStrId(String employeeStrId) {
        this.employeeStrId = employeeStrId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DataState getState() {
        return state;
    }

    public void setState(DataState state) {
        this.state = state;
    }
}

package com.ani.commons.earth.dto.organization;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-8-1.
 */
public class OrgMemberBriefDto implements Serializable {

    private static final long serialVersionUID = 8374679021257140357L;

    private Long employeeId;
    private Long accountId;
    private String name;
    private String employeeStrId;
    private String mobile;

    public OrgMemberBriefDto() {
    }

    public OrgMemberBriefDto(Long employeeId, Long accountId, String name, String employeeStrId, String mobile) {
        this.employeeId = employeeId;
        this.accountId = accountId;
        this.name = name;
        this.employeeStrId = employeeStrId;
        this.mobile = mobile;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

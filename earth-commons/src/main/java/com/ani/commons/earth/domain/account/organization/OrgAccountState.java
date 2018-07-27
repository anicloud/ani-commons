package com.ani.commons.earth.domain.account.organization;

import com.ani.utils.core.DataState;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-7-5.
 */
public class OrgAccountState  implements Serializable{

    private static final long serialVersionUID = -793242311850096306L;
    @JsonSerialize(using= ToStringSerializer.class)
    private Integer orgId;
    @JsonSerialize(using= ToStringSerializer.class)
    private Long employeeId;
    private String privateEmail;
    private String phone;
    private Boolean isAdmin;
    private DataState dataState;
    private String tgt;

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public String getTgt() {
        return tgt;
    }

    public void setTgt(String tgt) {
        this.tgt = tgt;
    }

    public OrgAccountState() {
    }

    public OrgAccountState(Integer orgId, Long employeeId, String privateEmail, String phone, Boolean isAdmin, DataState dataState) {
        this.orgId = orgId;
        this.employeeId = employeeId;
        this.privateEmail = privateEmail;
        this.phone = phone;
        this.isAdmin = isAdmin;
        this.dataState = dataState;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getPrivateEmail() {
        return privateEmail;
    }

    public void setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public DataState getDataState() {
        return dataState;
    }

    public void setDataState(DataState dataState) {
        this.dataState = dataState;
    }
}

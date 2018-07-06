package com.ani.commons.earth.domain.orgaccount;

import com.ani.utils.core.DataState;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-7-5.
 */
public class OrgAccountState  implements Serializable{

    private static final long serialVersionUID = -793242311850096306L;

    private Long orgId;
    private Long employeeId;
    private String privateEmail;
    private String phone;
    private String tgt;
    private DataState dataState;

    public OrgAccountState() {
    }


    public OrgAccountState(Long orgId, Long employeeId, String privateEmail, String phone, String tgt, DataState dataState) {
        this.orgId = orgId;
        this.employeeId = employeeId;
        this.privateEmail = privateEmail;
        this.phone = phone;
        this.tgt = tgt;
        this.dataState = dataState;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
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

    public String getTgt() {
        return tgt;
    }

    public void setTgt(String tgt) {
        this.tgt = tgt;
    }

    public DataState getDataState() {
        return dataState;
    }

    public void setDataState(DataState dataState) {
        this.dataState = dataState;
    }
}

package com.ani.commons.earth.domain.orgaccount;

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

    private DataState dataState;

    public OrgAccountState() {
    }


    public OrgAccountState(Integer orgId, Long employeeId, String privateEmail, String phone, DataState dataState) {
        this.orgId = orgId;
        this.employeeId = employeeId;
        this.privateEmail = privateEmail;
        this.phone = phone;

        this.dataState = dataState;
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

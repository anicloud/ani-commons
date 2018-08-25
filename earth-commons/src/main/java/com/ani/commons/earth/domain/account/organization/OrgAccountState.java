package com.ani.commons.earth.domain.account.organization;

import com.ani.utils.core.DataState;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-7-5.
 */
public class  OrgAccountState  implements Serializable{

    private static final long serialVersionUID = -793242311850096306L;
    @JsonSerialize(using= ToStringSerializer.class)
    private Long orgAccountId;
    @JsonSerialize(using= ToStringSerializer.class)
    private Long accountId;
//    private String privateEmail;
//    private String phone;
    private Boolean isAdmin;
    private DataState dataState;
    private String tgt;

//    public Boolean getAdmin() {
//        return isAdmin;
//    }
//
//    public void setAdmin(Boolean admin) {
//        isAdmin = admin;
//    }

    public String getTgt() {
        return tgt;
    }

    public void setTgt(String tgt) {
        this.tgt = tgt;
    }

    public OrgAccountState() {
    }

    public OrgAccountState(Long orgAccountId, Long accountId, Boolean isAdmin, DataState dataState, String tgt) {
        this.orgAccountId = orgAccountId;
        this.accountId = accountId;
        this.isAdmin = isAdmin;
        this.dataState = dataState;
        this.tgt = tgt;
    }


    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public OrgAccountState(Long orgAccountId, Long accountId, DataState dataState, String tgt) {
        this.orgAccountId = orgAccountId;
        this.accountId = accountId;
        this.dataState = dataState;
        this.tgt = tgt;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(Long orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

//    public String getPrivateEmail() {
//        return privateEmail;
//    }
//
//    public void setPrivateEmail(String privateEmail) {
//        this.privateEmail = privateEmail;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }


    public DataState getDataState() {
        return dataState;
    }

    public void setDataState(DataState dataState) {
        this.dataState = dataState;
    }
}

package com.ani.commons.earth.domain.organization.employee;

import com.ani.commons.earth.enumeration.Sex;
import com.ani.utils.core.DataState;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Map;

/**
 * Created by zhanglina on 18-5-9.
 * Last Modified by xuben on 18-7-9.
 */
public class OrgMember implements Serializable {
    private static final long serialVersionUID = 2336468316834700393L;

    @JsonSerialize(using = ToStringSerializer.class)
    private Long employeeId;
    private Long nodeId;
    private Long accountId;
    private Long orgAccountId;
    private String employeeEmail;
    private boolean hasPwd;
    private Integer employeeCount;
    private String name;
    private String employeeStrId;
    private String personalEmail;
    private String mobile;
    private String tel;
    private String birthday;
    private Sex sex;
    private Map<String, String> customFieldsValue;
    private DataState state;
    private Timestamp entryTime;
    private Timestamp resignTime;

    public OrgMember() {
    }

    public OrgMember(Long employeeId, Long nodeId, Long accountId, Long orgAccountId, String employeeEmail, boolean hasPwd, Integer employeeCount, String name, String employeeStrId, String personalEmail, String mobile, String tel, String birthday, Sex sex, Map<String, String> customFieldsValue, DataState state, Timestamp entryTime, Timestamp resignTime) {
        this.employeeId = employeeId;
        this.nodeId = nodeId;
        this.accountId = accountId;
        this.orgAccountId = orgAccountId;
        this.employeeEmail = employeeEmail;
        this.hasPwd = hasPwd;
        this.employeeCount = employeeCount;
        this.name = name;
        this.employeeStrId = employeeStrId;
        this.personalEmail = personalEmail;
        this.mobile = mobile;
        this.tel = tel;
        this.birthday = birthday;
        this.sex = sex;
        this.customFieldsValue = customFieldsValue;
        this.state = state;
        this.entryTime = entryTime;
        this.resignTime = resignTime;
    }

    public Long getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(Long orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeStrId() {
        return employeeStrId;
    }

    public void setEmployeeStrId(String employeeStrId) {
        this.employeeStrId = employeeStrId;
    }

    public Map<String, String> getCustomFieldsValue() {
        return customFieldsValue;
    }

    public void setCustomFieldsValue(Map<String, String> customFieldsValue) {
        this.customFieldsValue = customFieldsValue;
    }

    public Timestamp getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Timestamp entryTime) {
        this.entryTime = entryTime;
    }

    public Timestamp getResignTime() {
        return resignTime;
    }

    public void setResignTime(Timestamp resignTime) {
        this.resignTime = resignTime;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
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

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public DataState getState() {
        return state;
    }

    public void setState(DataState state) {
        this.state = state;
    }

    public boolean isHasPwd() {
        return hasPwd;
    }

    public void setHasPwd(boolean hasPwd) {
        this.hasPwd = hasPwd;
    }
}

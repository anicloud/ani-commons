package com.ani.commons.earth.domain.organization.employee;

import com.ani.commons.earth.enumeration.Sex;
import com.ani.utils.core.DataState;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by zhanglina on 18-5-9.
 * Last Modified by xuben on 18-7-9.
 */
public class OrgMember implements Serializable {
    private static final long serialVersionUID = 2336468316834700393L;

    @JsonSerialize(using= ToStringSerializer.class)
    private Long employee_id;
    private Long node_id;
    private Long account_id;
    private String org_email;
    private boolean hasPwd;
    private Integer employeeNum;
    private String name;
    private String nameAlphabet;
    private String privateEmail;
    private String phone;
    private String tel;
    private String politics;
    private Date birthday;
    private Sex sex;
    private String citizenId;
    private DataState state;
    private Timestamp updateTime;
    private Timestamp createTime;

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public Long getNode_id() {
        return node_id;
    }

    public void setNode_id(Long node_id) {
        this.node_id = node_id;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public String getOrg_email() {
        return org_email;
    }

    public void setOrg_email(String org_email) {
        this.org_email = org_email;
    }

    public Integer getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(Integer employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAlphabet() {
        return nameAlphabet;
    }

    public void setNameAlphabet(String nameAlphabet) {
        this.nameAlphabet = nameAlphabet;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public DataState getState() {
        return state;
    }

    public void setState(DataState state) {
        this.state = state;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public boolean isHasPwd() {
        return hasPwd;
    }

    public void setHasPwd(boolean hasPwd) {
        this.hasPwd = hasPwd;
    }
}

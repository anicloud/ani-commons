package com.ani.commons.earth.domain.organization.tree;

import com.ani.commons.earth.enumeration.Sex;
import com.ani.utils.core.DataState;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by zhanglina on 18-5-9.
 * Last Modified by xuben on 18-7-9.
 */
public class OrgMember implements Serializable {

    private static final long serialVersionUID = 2336468316834700393L;
    private Long employeeId; //id
    private String name;
    private String nameAlphabet;
    private String employeeNum;
    private String orgEmail;
    private String privateEmail;
    private String phone;
    private String roleId;
    private String tel;
    private String politics;
    private String birthday;
    private Sex sex;
    private String citizenId;
    private DataState state;
    private Timestamp createTime;
    private Timestamp updateTime;
    private byte[] password;
    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getNameAlphabet() {
        return nameAlphabet;
    }

    public void setNameAlphabet(String nameAlphabet) {
        this.nameAlphabet = nameAlphabet;
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

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public DataState getState() {
        return state;
    }

    public void setState(DataState state) {
        this.state = state;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }
}

package com.ani.commons.earth.dto.organization.org;


import com.ani.commons.earth.domain.id.Phone;
import com.ani.commons.earth.dto.id.AccountPhoneInfoDto;
import com.ani.commons.earth.enumeration.Sex;
import com.ani.utils.core.DataState;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OrgMemberInfoDto implements Serializable {

    private static final long serialVersionUID = -3731989256681013381L;
    private Integer orgId;
    private Long employeeId;// TODO: 18-5-11 改成id
    private String employeeNum;
    private String nameAlphabet;
    private Phone phone;
    private String email;
    private String orgEmail;
    private String name;
    private String politics;
    private String tel;
    private Date birthday;
    private Sex sex;
    private String citizenId;
    private DataState dataState;

    public OrgMemberInfoDto() {
    }

    public OrgMemberInfoDto(Integer orgId,String name,String email,Phone phone) {
        this.orgId= orgId;
        this.name = name;
        this.email=email;
        this.phone=phone;
    }

    public OrgMemberInfoDto(Integer orgId, Long employeeId, String employeeNum, String nameAlphabet, Phone phone, String email, String orgEmail, String name, String politics, String tel, Date birthday, Sex sex, String citizenId, DataState dataState) {
        this.orgId = orgId;
        this.employeeId = employeeId;
        this.employeeNum = employeeNum;
        this.nameAlphabet = nameAlphabet;
        this.phone= phone;
        this.email = email;
        this.orgEmail = orgEmail;
        this.name = name;
        this.politics = politics;
        this.tel = tel;
        this.birthday = birthday;
        this.sex = sex;
        this.citizenId = citizenId;
        this.dataState = dataState;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getNameAlphabet() {
        return nameAlphabet;
    }

    public void setNameAlphabet(String nameAlphabet) {
        this.nameAlphabet = nameAlphabet;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public DataState getDataState() {
        return dataState;
    }

    public void setDataState(DataState dataState) {
        this.dataState = dataState;
    }
}

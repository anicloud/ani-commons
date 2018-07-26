package com.ani.commons.earth.dto.organization.org;


import com.ani.commons.earth.enumeration.Sex;
import com.ani.utils.core.DataState;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OrgMemberInfoDto extends AniDto {

    private static final long serialVersionUID = -3731989256681013381L;

    private Long employeeId;
    @AniRequiredField
    private Long nodeId;
    private String orgEmail;
    @AniRequiredField
    private String name;
    @AniRequiredField
    private String employeeStrId;
    private String privateEmail;
    private String phone;
    private String tel;
    private Date birthday;
    private Sex sex;
    private String others;
    private DataState state;

    public OrgMemberInfoDto() {
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
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

    public OrgMemberInfoDto(Long employeeId, Long nodeId, String orgEmail, String name, String employeeStrId, String privateEmail, String phone, String tel, Date birthday, Sex sex, String others, DataState state) {
        this.employeeId = employeeId;
        this.nodeId = nodeId;
        this.orgEmail = orgEmail;
        this.name = name;
        this.employeeStrId = employeeStrId;
        this.privateEmail = privateEmail;
        this.phone = phone;
        this.tel = tel;
        this.birthday = birthday;
        this.sex = sex;
        this.others = others;
        this.state = state;
    }

    public String getOthers() {

        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public DataState getState() {
        return state;
    }

    public void setState(DataState state) {
        this.state = state;
    }

}

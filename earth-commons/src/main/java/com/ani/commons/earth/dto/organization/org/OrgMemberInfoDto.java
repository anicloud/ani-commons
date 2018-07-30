package com.ani.commons.earth.dto.organization.org;


import com.ani.commons.earth.enumeration.Sex;
import com.ani.utils.core.DataState;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Map;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OrgMemberInfoDto extends AniDto {

    private static final long serialVersionUID = -3731989256681013381L;

    private Long employeeId;
    @AniRequiredField
    private Long nodeId;
    private String employeeEmail;
    @AniRequiredField
    private String name;
    private String privateEmail;
    private Integer employeeCount;
    private String phone;
    private String others;
    @AniRequiredField
    private String employeeStrId;
    private String tel;
    private Date birthday;
    private Sex sex;
    private DataState state;

    public OrgMemberInfoDto() {
    }

    public OrgMemberInfoDto(Integer employeeCount,Long employeeId, Long nodeId, String employeeEmail, String name, String privateEmail, String phone, String others, String employeeStrId, String tel, Date birthday, Sex sex, DataState state) {
        this.employeeCount = employeeCount;
        this.employeeId = employeeId;
        this.nodeId = nodeId;
        this.employeeEmail = employeeEmail;
        this.name = name;
        this.privateEmail = privateEmail;
        this.phone = phone;
        this.others = others;
        this.employeeStrId = employeeStrId;
        this.tel = tel;
        this.birthday = birthday;
        this.sex = sex;
        this.state = state;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
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

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
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

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getEmployeeStrId() {
        return employeeStrId;
    }

    public void setEmployeeStrId(String employeeStrId) {
        this.employeeStrId = employeeStrId;
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

    public DataState getState() {
        return state;
    }

    public void setState(DataState state) {
        this.state = state;
    }
}

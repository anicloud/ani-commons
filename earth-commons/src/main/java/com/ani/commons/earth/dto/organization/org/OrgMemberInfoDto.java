package com.ani.commons.earth.dto.organization.org;


import com.ani.commons.earth.domain.id.Phone;
import com.ani.commons.earth.enumeration.Sex;
import com.ani.utils.core.DataState;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.sql.Date;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OrgMemberInfoDto extends AniDto {

    private static final long serialVersionUID = -3731989256681013381L;

    private Long employeeId;
    @AniRequiredField
    private Long nodeId;
    private Long orgAccountId;
    private String employeeEmail;
    @AniRequiredField
    private String name;
    private String personalEmail;
    private Integer employeeCount;
    private Phone mobile;
    private String others;
    @AniRequiredField
    private String employeeStrId;
    private String tel;
    private Date birthday;
    private Sex sex;
    private Map<String,String> customFieldsValue;
    private Set<Long> roleIds;
    private DataState state;

    public OrgMemberInfoDto() {

    }

    public Set<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Set<Long> roleIds) {
        this.roleIds = roleIds;
    }

    public OrgMemberInfoDto(Long nodeId, Long orgAccountId, Integer employeeCount, String employeeStrId) {
        this.nodeId = nodeId;
        this.orgAccountId = orgAccountId;
        this.employeeCount = employeeCount;
        this.employeeStrId = employeeStrId;
    }

    public OrgMemberInfoDto(Long employeeId, Long nodeId, Long orgAccountId, String employeeEmail, String name, String personalEmail, Integer employeeCount, Phone mobile, String others, String employeeStrId, String tel, Date birthday, Sex sex, Map<String, String> customFieldsValue, DataState state) {
        this.employeeId = employeeId;
        this.nodeId = nodeId;
        this.orgAccountId = orgAccountId;
        this.employeeEmail = employeeEmail;
        this.name = name;
        this.personalEmail = personalEmail;
        this.employeeCount = employeeCount;
        this.mobile = mobile;
        this.others = others;
        this.employeeStrId = employeeStrId;
        this.tel = tel;
        this.birthday = birthday;
        this.sex = sex;
        this.customFieldsValue = customFieldsValue;
        this.state = state;
    }

    public Long getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(Long orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    public void setMobile(Phone mobile) {
        this.mobile = mobile;
    }

    public Map<String, String> getCustomFieldsValue() {
        return customFieldsValue;
    }

    public void setCustomFieldsValue(Map<String, String> customFieldsValue) {
        this.customFieldsValue = customFieldsValue;
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

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public Phone getMobile() {
        return mobile;
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

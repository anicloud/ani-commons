package com.ani.commons.bus.earth.dto.organization.org;


import com.ani.commons.bus.earth.dto.organization.node.OTNodeOpDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OrgMemberAddDto implements Serializable {

    private static final long serialVersionUID = -3731989256681013381L;

    private Long orgId;
    private Short region;
    private String regionNum;
    private String phoneNum;
    private String email;
    private String name;
    private
    private OTNodeOpDto otNodeOpDto;

    public String getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(String regionNum) {
        this.regionNum = regionNum;
    }

    public OTNodeOpDto getOtNodeOpDto() {
        return otNodeOpDto;
    }

    public void setOtNodeOpDto(OTNodeOpDto otNodeOpDto) {
        this.otNodeOpDto = otNodeOpDto;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Short getRegion() {
        return region;
    }

    public void setRegion(Short region) {
        this.region = region;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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
}

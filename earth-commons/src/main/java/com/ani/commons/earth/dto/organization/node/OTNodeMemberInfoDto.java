package com.ani.commons.earth.dto.organization.node;

import com.ani.commons.earth.dto.organization.org.OrgMemberInfoDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-9.
 */
public class OTNodeMemberInfoDto implements Serializable {

    private static final long serialVersionUID = -3252726647759384457L;

    private OrgMemberInfoDto orgMemberInfoDto;
    private OTNodeOpDto otNodeOpDto;
    private Long roleId;
    public OrgMemberInfoDto getOrgMemberInfoDto() {
        return orgMemberInfoDto;
    }

    public OTNodeMemberInfoDto() {
    }

    public OTNodeMemberInfoDto(OrgMemberInfoDto orgMemberInfoDto, OTNodeOpDto otNodeOpDto, Long roleId) {
        this.orgMemberInfoDto = orgMemberInfoDto;
        this.otNodeOpDto = otNodeOpDto;
        this.roleId = roleId;
    }

    public void setOrgMemberInfoDto(OrgMemberInfoDto orgMemberInfoDto) {
        this.orgMemberInfoDto = orgMemberInfoDto;
    }

    public OTNodeOpDto getOtNodeOpDto() {
        return otNodeOpDto;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setOtNodeOpDto(OTNodeOpDto otNodeOpDto) {
        this.otNodeOpDto = otNodeOpDto;
    }
}

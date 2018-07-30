package com.ani.commons.earth.dto.organization.node;

import com.ani.commons.earth.dto.organization.org.OrgMemberInfoDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-9.
 */
public class OTNodeMemberInfoDto implements Serializable {

    private static final long serialVersionUID = -3252726647759384457L;

    private OrgMemberInfoDto orgMemberInfoDto;
    private Long roleId;
    public OrgMemberInfoDto getOrgMemberInfoDto() {
        return orgMemberInfoDto;
    }

    public OTNodeMemberInfoDto() {
    }
    public void setOrgMemberInfoDto(OrgMemberInfoDto orgMemberInfoDto) {
        this.orgMemberInfoDto = orgMemberInfoDto;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

}

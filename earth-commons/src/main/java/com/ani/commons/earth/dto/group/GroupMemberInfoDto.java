package com.ani.commons.earth.dto.group;

import com.ani.commons.earth.domain.account.organization.OrgAccountRole;
import com.ani.commons.earth.dto.role.RoleInfoDto;
import com.ani.utils.dto.AniDto;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.List;
import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 */
public class GroupMemberInfoDto extends AniDto {
    private static final long serialVersionUID = -4889324214752309538L;
    @JsonSerialize(using= ToStringSerializer.class)
    private Long accountId;
    private String name;
    private List<RoleInfoDto> roles;

    public GroupMemberInfoDto() {
    }



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupMemberInfoDto(Long accountId, String name, List<RoleInfoDto> roles) {
        this.accountId = accountId;
        this.name = name;
        this.roles = roles;
    }

    public List<RoleInfoDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleInfoDto> roles) {
        this.roles = roles;
    }
}

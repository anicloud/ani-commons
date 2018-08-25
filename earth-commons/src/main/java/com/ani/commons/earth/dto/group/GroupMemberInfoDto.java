package com.ani.commons.earth.dto.group;

import com.ani.commons.earth.dto.role.RoleOpDto;
import com.ani.utils.dto.AniDto;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.List;

/**
 * Created by zhanglina on 18-7-26.
 */
public class GroupMemberInfoDto extends AniDto {
    private static final long serialVersionUID = -4889324214752309538L;

    @JsonSerialize(using = ToStringSerializer.class)
    private Long accountId;

    private Long groupId;

    private String name;

    private List<RoleOpDto> roles;

    public GroupMemberInfoDto() {
    }

    public GroupMemberInfoDto(Long accountId, Long groupId, String name, List<RoleOpDto> roles) {
        this.accountId = accountId;
        this.groupId = groupId;
        this.name = name;
        this.roles = roles;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoleOpDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleOpDto> roles) {
        this.roles = roles;
    }
}

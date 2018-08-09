package com.ani.commons.earth.dto.group;

import com.ani.utils.dto.AniDto;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 * Last Modified by xuben on 18-8-3.
 */
public class GroupMemberAddDto extends AniDto {
    private static final long serialVersionUID = 7335217867980603248L;
    @JsonSerialize(using= ToStringSerializer.class)
    private Long groupId;
    @JsonSerialize(using= ToStringSerializer.class)
    private Long accountId;
    private Set<Long> roleIds;

    public GroupMemberAddDto() {
    }

    public GroupMemberAddDto(Long groupId, Long accountId, Set<Long> roleIds) {
        this.groupId = groupId;
        this.accountId = accountId;
        this.roleIds = roleIds;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Set<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Set<Long> roleIds) {
        this.roleIds = roleIds;
    }
}


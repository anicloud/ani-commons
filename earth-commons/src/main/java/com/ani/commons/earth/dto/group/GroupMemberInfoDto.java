package com.ani.commons.earth.dto.group;

import com.ani.commons.earth.domain.account.organization.OrgAccountRole;
import com.ani.utils.dto.AniDto;

import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 */
public class GroupMemberInfoDto extends AniDto {
    private static final long serialVersionUID = -4889324214752309538L;
    private Long accountId;
    private String name;
    private Set<OrgAccountRole> roles;

    public GroupMemberInfoDto() {
    }

    public GroupMemberInfoDto(Long accountId, String name, Set<OrgAccountRole> roles) {
        this.accountId = accountId;
        this.name = name;
        this.roles = roles;
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

    public Set<OrgAccountRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<OrgAccountRole> roles) {
        this.roles = roles;
    }
}

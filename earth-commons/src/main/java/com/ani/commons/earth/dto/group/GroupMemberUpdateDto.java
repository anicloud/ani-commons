package com.ani.commons.earth.dto.group;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 */
public class GroupMemberUpdateDto extends AniDto{
    private static final long serialVersionUID = -2279589906861710169L;

    @AniRequiredField
    private Long groupId;
    @AniRequiredField
    private Set<Long> roleId;

    public GroupMemberUpdateDto() {
    }

    public GroupMemberUpdateDto(Long groupId, Set<Long> roleId) {
        this.groupId = groupId;
        this.roleId = roleId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Set<Long> getRoleId() {
        return roleId;
    }

    public void setRoleId(Set<Long> roleId) {
        this.roleId = roleId;
    }
}

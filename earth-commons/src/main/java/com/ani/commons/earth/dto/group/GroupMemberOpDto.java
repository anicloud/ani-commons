package com.ani.commons.earth.dto.group;

import com.ani.utils.dto.AniRequiredField;

import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 */
public class GroupMemberOpDto extends GroupAdminOpDto {

    private static final long serialVersionUID = -2279589906861710169L;
    @AniRequiredField
    private Long memberAccountId;
    @AniRequiredField
    private Set<Long> roleId;

    public GroupMemberOpDto() {
    }

    public GroupMemberOpDto(Long opAccountId, Long privilegeGroupId, Long targetGroupId, Long memberAccountId) {
        super(opAccountId, privilegeGroupId, targetGroupId);
        this.memberAccountId = memberAccountId;
    }

    public GroupMemberOpDto(Long opAccountId, Long privilegeGroupId, Long targetGroupId, Long memberAccountId, Set<Long> roleId) {
        super(opAccountId, privilegeGroupId, targetGroupId);
        this.memberAccountId = memberAccountId;
        this.roleId = roleId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getMemberAccountId() {
        return memberAccountId;
    }

    public void setMemberAccountId(Long memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    public Set<Long> getRoleId() {
        return roleId;
    }

    public void setRoleId(Set<Long> roleId) {
        this.roleId = roleId;
    }
}

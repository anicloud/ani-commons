package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.group.AniAccountGroup;
import com.ani.commons.earth.dto.group.*;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;
import java.util.Set;

/**
 * Last Modified by xuben on 18-8-3.
 */
public interface AccountGroupService {

    public void createGroup(AccountGroupInfoDto accountGroupInfoDto, Long opAccountId) throws AniRuleException, AniAuthException;

    public void removeGroup(Long groupId, Long opAccountId) throws AniRuleException, AniAuthException;

    public void modifyGroupProfile(AccountGroupInfoDto accountGroupInfoDto, Long opAccountId) throws AniRuleException, AniAuthException;

    public AniAccountGroup findByGroupId(Long groupId, Long opAccountId) throws AniRuleException, AniDataException, AniAuthException;

    public List<AniAccountGroup> findGroupsByOwnerId(Long accountId);

    public void addAMemberToGroup(GroupMemberAddDto groupMemberAddDto, Long opAccountId) throws AniRuleException, AniDataException, AniAuthException;

    public void updateAllMembers(GroupAllMembersInfoDto groupAllMembersInfoDto, Long opAccountId);

    public void addRoleToMember(Long groupId, Long accountId, Long roleId);

    public void removeMemberFromGroup(Long groupId, Long accountId, Long opAccountId);

    public void clearGroup(Long groupId, Long opAccountId);

    public GroupAllMembersInfoDto getAllMembersInfo(Long groupId, Long opAccountId);

    public Set<Long> getMemberRoleIds(Long groupId, Long accountId, Long opAccountId);

}

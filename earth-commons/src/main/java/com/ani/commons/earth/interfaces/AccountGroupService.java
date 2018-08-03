package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.group.AniAccountGroup;
import com.ani.commons.earth.dto.group.*;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

/**
 * Last Modified by xuben on 18-8-3.
 */
public interface AccountGroupService {

    public void createGroup(AccountGroupInfoDto accountGroupInfoDto, Long opAccountId) throws AniRuleException, AniAuthException;

    public void removeGroup(Long groupId, Long opAccountId) throws AniRuleException, AniAuthException;

    public void modifyGroupProfile(AccountGroupInfoDto accountGroupInfoDto, Long opAccountId) throws AniRuleException, AniAuthException;

    public AniAccountGroup findByGroupId(Long groupId,Long opAccountId) throws AniRuleException, AniDataException, AniAuthException;

    public List<AniAccountGroup> findGroupsByOwnerId(Long accountId);

    public void addAMemberToGroup(Long opAccountId, GroupMemberAddDto groupMemberAddDto) throws AniRuleException, AniDataException, AniAuthException;

    public void updateAllMembers(Long opAccountId, GroupMemberUpdateDto memberUpdateDto);

    public void removeMemberFromGroup(Long opAccountId, GroupMemberRemoveDto removeDto) throws AniRuleException, AniDataException;


    public List<GroupMemberInfoDto> getGroupMember(Long opAccountId,Long groupId);
}

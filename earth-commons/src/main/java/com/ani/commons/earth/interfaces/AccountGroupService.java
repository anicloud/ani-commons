package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.group.AniAccountGroup;
import com.ani.commons.earth.dto.group.*;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

/**
 * Last Modified by xuben on 18-8-2.
 */
public interface AccountGroupService {

    public List<AniAccountGroup> findGroupsByOwnerId(Long accountId) throws AniRuleException, AniDataException;

    public AniAccountGroup findByGroupId(Long groupId,Long opAccountId) throws AniRuleException, AniDataException, AniAuthException;

    public void createGroup(AccountGroupInfoDto accountGroupInfoDto, Long opAccountId) throws AniRuleException, AniAuthException;

    public void removeGroup(Long groupId, Long opAccountId) throws AniRuleException, AniAuthException;

    public void modifyGroupProfile(AccountGroupInfoDto accountGroupInfoDto, Long opAccountId) throws AniRuleException, AniAuthException;

    public void removeMemberFromGroup(Long opAccountId, GroupMemberRemoveDto removeDto) throws AniRuleException, AniDataException;

    public void addMemberToGroup(Long opAccountId, GroupMemberAddDto groupMemberAddDto)throws AniRuleException,AniDataException;

    public void updateMemberRole(Long opAccountId, GroupMemberUpdateDto memberUpdateDto);

    public List<GroupMemberInfoDto> getGroupMember(Long opAccountId,Long groupId);
}

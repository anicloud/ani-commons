package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.group.AniAccountGroup;
import com.ani.commons.earth.dto.group.*;
import com.ani.commons.earth.dto.group.GroupAdminOpDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;
import java.util.Set;

/**
 * Last Modified by xuben on 18-8-9.
 */
public interface AccountGroupService {

    public void createGroup(GroupRegisterDto registerDto) throws AniRuleException, AniAuthException;

    public void removeGroup(GroupAdminOpDto opDto) throws AniRuleException, AniAuthException;

    public void modifyGroupProfile(GroupRegisterDto registerDto) throws AniRuleException, AniAuthException;

    public AniAccountGroup findByGroupId(GroupAdminOpDto opDto) throws AniRuleException, AniDataException, AniAuthException;

    public AccountGroupInfoDto findAccountGroupInfoDtoById(GroupAdminOpDto opDto) throws AniRuleException, AniDataException, AniAuthException;

    public List<AniAccountGroup> findGroupsByOwnerId(Long accountId);

    public void addMemberIntoGroup(GroupMemberOpDto groupMemberOpDto) throws AniRuleException, AniDataException, AniAuthException;

    public void updateMemberRole(GroupMemberOpDto groupMemberOpDto) throws AniRuleException;

    public void removeMemberFromGroup(GroupMemberOpDto groupMemberOpDto) throws AniRuleException;

    public void clearGroup(GroupAdminOpDto opDto) throws AniRuleException, AniAuthException;

    public List<GroupMemberInfoDto> getAllMembersInfo(GroupAdminOpDto opDto) throws AniRuleException, AniAuthException;

    public Set<Long> getMemberRoleIds(GroupMemberOpDto groupMemberOpDto) throws AniRuleException, AniAuthException;

}

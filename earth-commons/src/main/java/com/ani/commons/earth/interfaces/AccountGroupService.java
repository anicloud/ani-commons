package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.account.AniAccountGroup;
import com.ani.commons.earth.dto.group.AccountGroupInfoDto;
import com.ani.commons.earth.dto.group.GroupMemberAddDto;
import com.ani.commons.earth.dto.group.GroupMemberRemoveDto;
import com.ani.commons.earth.dto.group.GroupUpdateDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AccountGroupService {

    public List<AniAccountGroup> findGroupsByAccountId(Long accountId) throws AniDataException;

    public AniAccountGroup findByGroupId(Long groupId,Long opAccountId) throws AniDataException;


    public void createGroup(AccountGroupInfoDto accountGroupInfoDto, Long accountId) throws AniRuleException, AniAuthException;

    public boolean removeGroup(Long groupId, Long opAccountId) throws AniRuleException, AniAuthException;

    public void modifyGroupProfile(GroupUpdateDto groupUpdateDto, Long opAccountId) throws AniRuleException, AniAuthException;

    public void removeMemberFromGroup(Long opAccountId, GroupMemberRemoveDto removeDto) throws AniRuleException, AniDataException;

    public void addMemberToGroup(Long opAccountId, GroupMemberAddDto groupMemberAddDto);

}

package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.account.AniAccountGroup;
import com.ani.commons.earth.dto.group.AccountGroupInfoDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

public interface AccountGroupService {

    public List<AniAccountGroup> findGroupsByAccountsId(List<Long> accountId) throws AniDataException;

    public AniAccountGroup findByGroupId(Long groupId) throws AniDataException;

    public void removeAccountsFromGroup(Long groupId, List<Long> accountsId) throws AniRuleException, AniDataException;

    public void addAccountsToGroup(Long groupId, List<Long> accountsId);

    public boolean clearGroup(Long accountId, Long groupId);

    public void createGroup(AccountGroupInfoDto accountGroupInfoDto, Long opEmployeeId) throws AniRuleException, AniAuthException;

    public boolean removeGroup(Long groupId, Long opEmployeeId) throws AniRuleException, AniAuthException;

    public void modifyGroupProfile(AccountGroupInfoDto accountGroupInfoDto, Long opEmployeeId) throws AniRuleException, AniAuthException;

}

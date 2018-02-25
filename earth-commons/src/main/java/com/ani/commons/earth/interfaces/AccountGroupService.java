package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.account.AniAccountGroup;
import com.ani.commons.earth.dto.info.AccountGroupProfileDto;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

public interface AccountGroupService {

    public List<AniAccountGroup> findGroupsByAccountsId(List<Long> accountId) throws AniDataException;

    public AniAccountGroup findByGroupId(Long groupId) throws AniDataException;

    public AniAccountGroup removeAccountsFromGroup(Long groupId, List<Long> accountsId) throws AniRuleException, AniDataException;

    public AniAccountGroup addAccountsToGroup(Long groupId, List<Long> accountsId);

    public AniAccountGroup modifyGroupProfile(AccountGroupProfileDto groupProfileDto);

    public boolean removeGroupFromAccount(Long accountId, Long groupId);

    public boolean clearGroup(Long accountId, Long groupId);
}

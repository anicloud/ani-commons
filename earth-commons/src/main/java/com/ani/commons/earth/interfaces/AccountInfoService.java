package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.account.AniAccount;
import com.ani.commons.earth.dto.account.PersonalAccessibilityDto;
import com.ani.commons.earth.dto.account.AccountInfoDto;
import com.ani.commons.earth.dto.account.organization.OrgAccountBriefDto;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

public interface AccountInfoService {


    public void checkAccountExistence(Long accountId) throws AniRuleException;

    public List<Boolean> checkAccountsExistence(List<Long> accountsId);

    public AniAccount findAniAccountById(Long accountId, AccountType accountType)throws AniRuleException;

//    public AniPersonalAccount findAniAccountByPhone(Long accountId)throws AniRuleException;

    public AccountInfoDto findAccountInfoById(Long accountId,AccountType accountType)throws AniRuleException;

    public void checkPersonalResourceAccessibility(PersonalAccessibilityDto personalResourcesAccessDto)throws AniRuleException;

    public List<OrgAccountBriefDto> getOrgAccountByEmployeeAccountId(Long accountId) throws AniRuleException;


}

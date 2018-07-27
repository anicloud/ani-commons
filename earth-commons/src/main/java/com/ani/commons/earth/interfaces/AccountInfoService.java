package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.id.Email;
import com.ani.commons.earth.domain.id.Phone;
import com.ani.commons.earth.domain.account.AniAccount;
import com.ani.commons.earth.dto.account.PersonalAccessibilityDto;
import com.ani.commons.earth.dto.account.AccountInfoDto;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

public interface AccountInfoService {


    public void checkAccountExistence(Long accountId) throws AniRuleException;

    public List<Boolean> checkAccountsExistence(List<Long> accountsId);

    public AniAccount findAccountById(Long accountId);

    public AccountInfoDto findAccountInfoById(Long accountId);

    public List<AniAccount> findAccountsById(List<Long> accountsId);

    public List<AniAccount> findAccountsByName(List<String> accountsName);

    public List<AniAccount> findAccountsByPhone(List<Phone> phoneNums);

    public List<AniAccount> findAccountsByEmail(List<Email> emailAdds);

    public void checkPersonalResourceAccessibility(PersonalAccessibilityDto personalResourcesAccessDto)throws AniRuleException;

}

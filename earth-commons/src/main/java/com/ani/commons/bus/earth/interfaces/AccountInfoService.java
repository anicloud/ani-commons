package com.ani.commons.bus.earth.interfaces;

import com.ani.commons.bus.earth.domain.id.Email;
import com.ani.commons.bus.earth.domain.id.Phone;
import com.ani.commons.bus.earth.domain.account.AniAccount;

import java.util.List;

public interface AccountInfoService {

    public AniAccount findAccountById(Long accountId);

    public List<AniAccount> findAccountsById(List<Long> accountsId);

    public List<AniAccount> findAccountsByName(List<String> accountsName);

    public List<AniAccount> findAccountsByPhone(List<Phone> phoneNums);

    public List<AniAccount> findAccountsByEmail(List<Email> emailAdds);




}
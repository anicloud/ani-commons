package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.account.AniAccount;
import com.ani.commons.earth.domain.id.Email;
import com.ani.commons.earth.domain.id.Phone;
import com.ani.commons.earth.dto.info.AccountProfileDto;

import java.io.FileInputStream;
import java.util.List;

public interface AccountInfoService {

    public AniAccount findAccountById(Long accountId);

    public List<AniAccount> findAccountsById(List<Long> accountsId);

    public List<AniAccount> findAccountsByName(List<String> accountsName);

    public List<AniAccount> findAccountsByPhone(List<Phone> phoneNums);

    public List<AniAccount> findAccountsByEmail(List<Email> emailAdds);




}

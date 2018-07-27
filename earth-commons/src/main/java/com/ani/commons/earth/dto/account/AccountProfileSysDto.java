package com.ani.commons.earth.dto.account;

import com.ani.commons.earth.enumeration.AccountType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-4.
 */
public class AccountProfileSysDto extends AccountProfileDto implements Serializable{
    @Override
    public AccountType getAccountType() {
        return AccountType.SYSTEM;
    }
}

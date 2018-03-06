package com.ani.commons.earth.dto.info;

import com.ani.commons.earth.enumeration.AccountType;

/**
 * Created by zhanglina on 18-3-4.
 */
public class AccountProfileSysDto extends AccountProfileDto {
    @Override
    public AccountType getAccountType() {
        return AccountType.SYSTEM;
    }
}

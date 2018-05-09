package com.ani.commons.bus.earth.dto.info;

import com.ani.commons.bus.earth.enumeration.AccountType;

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
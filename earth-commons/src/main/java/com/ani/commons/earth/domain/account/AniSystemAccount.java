package com.ani.commons.earth.domain.account;

import com.ani.commons.earth.enumeration.AccountType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-2-27.
 */
public class AniSystemAccount extends AniAccount implements Serializable {

    private static final long serialVersionUID = -1338664649876099191L;

    public AniSystemAccount() {
    }

    public AniSystemAccount(Long accountId, String phone, String email, Boolean hasPwd, AccountType type) {
        super(accountId, phone, email, hasPwd, type);
    }
}

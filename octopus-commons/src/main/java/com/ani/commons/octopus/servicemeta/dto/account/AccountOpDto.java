package com.ani.commons.octopus.servicemeta.dto.account;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-31.
 */
public abstract class AccountOpDto implements Serializable{

    private static final long serialVersionUID = 1723763734864567639L;

    Long accountId;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}

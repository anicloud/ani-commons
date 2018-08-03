package com.ani.commons.earth.dto.id;

import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 17-12-29.
 */
public abstract class AccountIdInfoDto extends AniDto {

    private static final long serialVersionUID = 1752652980676728527L;

    private Long accountId;

    @AniRequiredField
    private AccountType type;

    public AccountIdInfoDto() {
    }

    public AccountIdInfoDto(Long accountId, AccountType type) {
        this.accountId = accountId;
        this.type = type;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}

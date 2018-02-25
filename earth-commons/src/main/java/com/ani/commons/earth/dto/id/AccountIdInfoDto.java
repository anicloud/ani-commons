package com.ani.commons.earth.dto.id;

import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 17-12-29.
 */
public abstract class AccountIdInfoDto extends AniDto {

    private Long accountId;

    public AccountIdInfoDto() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}

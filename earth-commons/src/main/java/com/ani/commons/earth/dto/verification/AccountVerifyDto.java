package com.ani.commons.earth.dto.verification;

import com.ani.commons.earth.dto.auth.AniAccountAuthDto;
import com.ani.commons.earth.dto.id.AccountIdInfoDto;

public abstract class AccountVerifyDto {

    private AccountIdInfoDto accountIdInfoDto;

    private AniAccountAuthDto accountAuthDto;

    public AccountVerifyDto() {
    }

    public AccountIdInfoDto getAccountIdInfoDto() {
        return accountIdInfoDto;
    }

    public void setAccountIdInfoDto(AccountIdInfoDto accountIdInfoDto) {
        this.accountIdInfoDto = accountIdInfoDto;
    }

    public AniAccountAuthDto getAccountAuthDto() {
        return accountAuthDto;
    }

    public void setAccountAuthDto(AniAccountAuthDto accountAuthDto) {
        this.accountAuthDto = accountAuthDto;
    }
}

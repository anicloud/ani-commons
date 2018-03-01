package com.ani.commons.earth.dto.verification;

import com.ani.commons.earth.dto.id.AccountIdInfoDto;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AccountIdVerifyDto extends AccountIdInfoDto {

    private AccountIdInfoDto accountIdInfoDto;

    private String aniSessionId;

    private String verificationCode;

    public String getAniSessionId() {
        return aniSessionId;
    }

    public void setAniSessionId(String aniSessionId) {
        this.aniSessionId = aniSessionId;
    }

    public AccountIdVerifyDto() {
    }

    public AccountIdInfoDto getAccountIdInfoDto() {
        return accountIdInfoDto;
    }

    public void setAccountIdInfoDto(AccountIdInfoDto accountIdInfoDto) {
        this.accountIdInfoDto = accountIdInfoDto;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}

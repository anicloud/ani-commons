package com.ani.commons.earth.dto.verification;

import com.ani.commons.earth.dto.auth.AniAccountAuthDto;
import com.ani.commons.earth.dto.id.AccountIdInfoDto;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AccountIdVerifyDto extends AccountVerifyDto {

    private String verificationCode;

    public AccountIdVerifyDto() {
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

}

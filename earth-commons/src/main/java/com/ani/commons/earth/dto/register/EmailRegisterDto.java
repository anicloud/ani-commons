package com.ani.commons.earth.dto.register;

import com.ani.commons.earth.dto.verification.AccountEmailVerificationDto;

/**
 * Created by zhanglina on 17-12-27.
 */
public class EmailRegisterDto extends RegisterDto{

    AccountEmailVerificationDto emailVerification;

    public EmailRegisterDto() {
    }

    public EmailRegisterDto(AccountEmailVerificationDto emailVerification) {
        this.emailVerification = emailVerification;
    }

    public AccountEmailVerificationDto getEmailVerification() {
        return emailVerification;
    }

    public void setEmailVerification(AccountEmailVerificationDto emailVerification) {
        this.emailVerification = emailVerification;
    }
}

package com.ani.commons.earth.dto.register;

import com.ani.commons.earth.dto.PhoneNumDto;
import com.ani.commons.earth.dto.verification.AccountPhoneVerificationDto;

/**
 * Created by zhanglina on 17-12-27.
 */
public class PhoneRegisterDto extends RegisterDto {

    AccountPhoneVerificationDto phoneVerification;

    public PhoneRegisterDto() {
    }

    public AccountPhoneVerificationDto getPhoneVerification() {
        return phoneVerification;
    }

    public void setPhoneVerification(AccountPhoneVerificationDto phoneVerification) {
        this.phoneVerification = phoneVerification;
    }
}

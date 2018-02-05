package com.ani.commons.earth.dto.verification;

import com.ani.commons.earth.domain.PhoneNum;
import com.ani.commons.earth.dto.PhoneNumDto;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AccountPhoneVerificationDto extends AccountVerificationDto{

    private PhoneNumDto phoneNumDto;

    public AccountPhoneVerificationDto() {
        super();
    }

    public PhoneNumDto getPhoneNumDto() {
        return phoneNumDto;
    }

    public void setPhoneNumDto(PhoneNumDto phoneNumDto) {
        this.phoneNumDto = phoneNumDto;
    }

}

package com.ani.commons.earth.dto.register;

import com.ani.commons.earth.domain.PhoneNum;
import com.ani.commons.earth.dto.PhoneNumDto;

/**
 * Created by zhanglina on 17-12-27.
 */
public class RegisterResultDto {

    Long accountId;
    PhoneNumDto phoneNumDto;
    String email;

    public RegisterResultDto() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public PhoneNumDto getPhoneNumDto() {
        return phoneNumDto;
    }

    public void setPhoneNumDto(PhoneNumDto phoneNumDto) {
        this.phoneNumDto = phoneNumDto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

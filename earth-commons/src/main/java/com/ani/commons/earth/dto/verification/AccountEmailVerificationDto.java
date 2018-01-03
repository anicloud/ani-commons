package com.ani.commons.earth.dto.verification;

import com.ani.commons.earth.dto.EmailDto;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AccountEmailVerificationDto extends AccountVerificationDto {

    private EmailDto email;

    public AccountEmailVerificationDto() {
        super();
    }
    
    public EmailDto getEmail() {
        return email;
    }

    public void setEmail(EmailDto email) {
        this.email = email;
    }
}

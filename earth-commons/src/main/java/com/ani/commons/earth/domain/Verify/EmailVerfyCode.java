package com.ani.commons.earth.domain.Verify;

import com.ani.commons.earth.domain.id.Email;

/**
 * Created by zhanglina on 18-3-1.
 */
public class EmailVerfyCode extends VerifyCode{
    Email email;

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}

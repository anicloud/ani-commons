package com.ani.commons.earth.dto.verification;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-1-3.
 */
public class AccountPwdVerifyDto extends AccountVerifyDto implements Serializable{

    private static final long serialVersionUID = -5129235984576413777L;

    byte[] password;

    public AccountPwdVerifyDto() {
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }
}

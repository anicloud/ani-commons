package com.ani.commons.earth.dto.verification;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-1-3.
 */
public class AccountPwdVerifyDto extends AccountVerifyDto implements Serializable{

    private static final long serialVersionUID = -5129235984576413777L;

    Byte[] password;

    public AccountPwdVerifyDto() {
    }

    public Byte[] getPassword() {
        return password;
    }

    public void setPassword(Byte[] password) {
        this.password = password;
    }

}

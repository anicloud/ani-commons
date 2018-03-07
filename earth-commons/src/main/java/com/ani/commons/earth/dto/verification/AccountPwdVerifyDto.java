package com.ani.commons.earth.dto.verification;

/**
 * Created by zhanglina on 18-1-3.
 */
public class AccountPwdVerifyDto extends AccountVerifyDto {

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

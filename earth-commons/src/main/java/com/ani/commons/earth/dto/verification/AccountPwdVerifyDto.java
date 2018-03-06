package com.ani.commons.earth.dto.verification;

/**
 * Created by zhanglina on 18-1-3.
 */
public class AccountPwdVerifyDto extends AccountVerifyDto {

    String password;

    public AccountPwdVerifyDto() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.ani.commons.earth.dto.verification;

/**
 * Created by zhanglina on 18-1-3.
 */
public class AccountPwdVerifyDto extends AccountVerifyDto {

    Long accountId;
    String password;

    public AccountPwdVerifyDto() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

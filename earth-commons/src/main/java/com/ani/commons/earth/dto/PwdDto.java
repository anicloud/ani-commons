package com.ani.commons.earth.dto;

/**
 * Created by zhanglina on 18-1-3.
 */
public class PwdDto {
    Long accountId;
    Byte[] password;

    public PwdDto() {
    }

    public PwdDto(Long accountId, Byte[] password) {

        this.accountId = accountId;
        this.password = password;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Byte[] getPassword() {
        return password;
    }

    public void setPassword(Byte[] password) {
        this.password = password;
    }
}

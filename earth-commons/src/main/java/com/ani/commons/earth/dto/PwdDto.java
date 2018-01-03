package com.ani.commons.earth.dto;

/**
 * Created by zhanglina on 18-1-3.
 */
public class PwdDto {
    Long accountId;
    byte[] password;

    public PwdDto() {
    }

    public PwdDto(Long accountId, byte[] password) {

        this.accountId = accountId;
        this.password = password;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }
}

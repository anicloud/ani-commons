package com.ani.commons.earth.dto.verification;

/**
 * Created by zhanglina on 17-12-27.
 */
public abstract class AccountVerificationDto {

    protected Long accountId;

    protected String verificationCode;

    public AccountVerificationDto() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
    
    //public abstract String getCacheKey(String prefix);
}

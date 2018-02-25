package com.ani.commons.earth.domain.id;

public class AccountIdInfo {

    Long accountId;
    Email accountEmail;
    Phone accountPhone;

    public AccountIdInfo() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Email getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(Email accountEmail) {
        this.accountEmail = accountEmail;
    }

    public Phone getAccountPhone() {
        return accountPhone;
    }

    public void setAccountPhone(Phone accountPhone) {
        this.accountPhone = accountPhone;
    }
}

package com.ani.commons.earth.domain.account;
import com.ani.commons.earth.enumeration.AccountType;

import java.io.Serializable;
import java.util.Objects;
public abstract class AniAccount implements Serializable{

    private static final long serialVersionUID = -1997253108936634154L;
    /**
     * Account logic id
     */
    Long accountId;

    String phone;

//    String userName;

    String email;
    /**
     * Have set password
     */
    Boolean hasPwd;

    /**
     * Account valueType
     */
    AccountType type;

    /**
     * File path rule: /[accountId]/[portraitId](timestamp).jpg
     */
    String fileType;

    public AniAccount() {
    }

    public AniAccount(Long accountId, String phone, String email, Boolean hasPwd, AccountType type, String fileType) {
        this.accountId = accountId;
        this.phone = phone;
        this.email = email;
        this.hasPwd = hasPwd;
        this.type = type;
        this.fileType = fileType;
    }

//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Boolean getHasPwd() {
        return hasPwd;
    }

    public void setHasPwd(Boolean hasPwd) {
        this.hasPwd = hasPwd;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.accountId);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}

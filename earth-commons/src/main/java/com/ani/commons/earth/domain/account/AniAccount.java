package com.ani.commons.earth.domain.account;

import com.ani.commons.earth.domain.id.Phone;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.Sex;

import java.util.List;
import java.util.Objects;

public class AniAccount {

    /**
     * Account logic id
     */
    Long accountId;

    /**
     * Account name
     */
    String name;

    /**
     * Sex
     */
    Sex sex;

    /**
     * Have set password
     */
    Boolean hasPwd;

    /**
     * Account type
     */
    AccountType type;

    /**
     * Phone number with region code
     */
    Phone phoneNum;

    /**
     * Email
     */
    String email;

    /**
     * File path rule: /[accountId]/[portraitId](timestamp).jpg
     */
    Long portraitId;

    /**
     * Groups
     */
    List<AniAccountGroup> groups;

    public AniAccount() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
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

    public Phone getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Phone phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPortraitId() {
        return portraitId;
    }

    public void setPortraitId(Long portraitId) {
        this.portraitId = portraitId;
    }

    public List<AniAccountGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<AniAccountGroup> groups) {
        this.groups = groups;
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

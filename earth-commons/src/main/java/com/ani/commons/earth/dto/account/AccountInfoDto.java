package com.ani.commons.earth.dto.account;

import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.Sex;
import com.ani.utils.core.DataState;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-7-17.
 */
public class AccountInfoDto implements Serializable {

    private static final long serialVersionUID = 5550454072401738905L;

    @JsonSerialize(using= ToStringSerializer.class)

    private Long accountId;

    private String phone;

    private String userName;

    private String email;

    private Sex sex;

    private String name;

    private String url;

    private AccountType accountType;

    public AccountInfoDto() {
    }

    public AccountInfoDto(Long accountId, String phone, String userName, String email, Sex sex, String name, String url, AccountType accountType) {
        this.accountId = accountId;
        this.phone = phone;
        this.userName = userName;
        this.email = email;
        this.sex = sex;
        this.name = name;
        this.url = url;
        this.accountType = accountType;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}

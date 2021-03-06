package com.ani.commons.earth.domain.account;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.core.DataState;

import java.io.Serializable;
import java.util.Objects;
public abstract class AniAccount implements Serializable{

    private static final long serialVersionUID = -1997253108936634154L;
    /**
     * Account logic id
     */
    private Long accountId;
    private String phone;
    private String email;
    private String name;
    DataState state;

    public DataState getState() {
        return state;
    }

    public void setState(DataState state) {
        this.state = state;
    }

    /**
     * Account valueType
     */
    private AccountType type;


    public AniAccount() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AniAccount(Long accountId, String phone, String email, String name, DataState state, AccountType type) {
        this.accountId = accountId;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.state = state;
        this.type = type;
    }

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

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
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

package com.ani.commons.earth.domain.account.personal;

import com.ani.commons.earth.domain.account.AniAccount;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.Sex;
import com.ani.utils.core.DataState;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-2-27.
 */
public class AniPersonalAccount extends AniAccount implements Serializable {
    private static final long serialVersionUID = -909456961243482140L;
    /**
     * Account sex
     */
    private Sex sex;
    /**
     * Account name
     */
    private String username;

    private Boolean hasPwd;
    public AniPersonalAccount() {
    }

    public AniPersonalAccount(Long accountId, String phone, String email, String name, DataState state, AccountType type, Sex sex, String username, Boolean hasPwd) {
        super(accountId, phone, email, name, state, type);
        this.sex = sex;
        this.username = username;
        this.hasPwd = hasPwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}

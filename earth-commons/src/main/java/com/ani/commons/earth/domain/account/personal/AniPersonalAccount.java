package com.ani.commons.earth.domain.account.personal;

import com.ani.commons.earth.domain.account.AniAccount;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.Sex;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-2-27.
 */
public class  AniPersonalAccount extends AniAccount implements Serializable {
    private static final long serialVersionUID = -909456961243482140L;
    /**
     * Account sex
     */
    private Sex sex;
    /**
     * Account name
     */
    private String name;

    private String hasPwd;
    public AniPersonalAccount() {
    }

    public AniPersonalAccount(Long accountId, String phone, String email,AccountType type, Sex sex, String name) {
        super(accountId, phone, email, type);
        this.sex = sex;
        this.name = name;
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
}

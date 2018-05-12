package com.ani.commons.earth.domain.account;

import com.ani.commons.earth.enumeration.Sex;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-2-27.
 */
public class AniPersonalAccount extends AniAccount implements Serializable {
    private static final long serialVersionUID = -909456961243482140L;
    /**
     * Account sex
     */
    Sex sex;
    /**
     * Account name
     */
    String name;

    public AniPersonalAccount() {
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

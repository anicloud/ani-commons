package com.ani.commons.earth.domain.account;

import com.ani.commons.earth.domain.id.Phone;
import com.ani.commons.earth.enumeration.Sex;

/**
 * Created by zhanglina on 18-2-27.
 */
public class AniPersonalAccount extends AniAccount {
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

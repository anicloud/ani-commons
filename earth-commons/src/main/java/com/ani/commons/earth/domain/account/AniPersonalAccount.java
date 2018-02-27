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
    /**
     * Phone number with region code
     */
    Phone phoneNum;
    /**
     * Email
     */
    String email;

    public AniPersonalAccount() {
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
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
}

package com.ani.commons.earth.domain.account;

import com.ani.commons.earth.domain.id.Phone;

/**
 * Created by zhanglina on 18-2-27.
 */
public class AniOrgAccount extends AniAccount {
    /**
     * Account name
     */
    String name;


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

    public AniOrgAccount() {

    }

    /**
     * Phone number with region code
     */
    Phone phoneNum;

    /**
     * Email
     */
    String email;
}

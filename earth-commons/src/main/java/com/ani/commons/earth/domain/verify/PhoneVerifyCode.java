package com.ani.commons.earth.domain.verify;

import com.ani.commons.earth.domain.id.Phone;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-1.
 */
public class PhoneVerifyCode extends VerifyCode  implements Serializable{

    private static final long serialVersionUID = -7054877548709647650L;
    String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

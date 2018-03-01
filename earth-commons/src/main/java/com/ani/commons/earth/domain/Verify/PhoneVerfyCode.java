package com.ani.commons.earth.domain.Verify;

import com.ani.commons.earth.domain.id.Phone;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-1.
 */
public class PhoneVerfyCode extends VerifyCode  implements Serializable{

    Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}

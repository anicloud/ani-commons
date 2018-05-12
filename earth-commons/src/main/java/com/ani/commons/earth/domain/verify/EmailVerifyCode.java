package com.ani.commons.earth.domain.verify;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-1.
 */
public class EmailVerifyCode extends VerifyCode implements Serializable{
    private static final long serialVersionUID = 2598921477174630195L;
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.ani.commons.earth.dto.verification;

import java.io.Serializable;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AccountIdVerifyDto extends AccountVerifyDto implements Serializable {

    private static final long serialVersionUID = -4801011937925907280L;
    private String verificationCode;
    public AccountIdVerifyDto() {
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

}

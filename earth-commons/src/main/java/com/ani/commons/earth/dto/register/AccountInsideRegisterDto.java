package com.ani.commons.earth.dto.register;

import com.ani.commons.earth.domain.id.Phone;
import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-7-5.
 * Last Modified by xuben on 18-7-6.
 */
public class AccountInsideRegisterDto extends AniDto{

    private static final long serialVersionUID = -1322098736708118531L;

    private String privateEmail;
    private Phone privatePhone;


    public AccountInsideRegisterDto() {
    }

    public AccountInsideRegisterDto(String privateEmail, Phone privatePhone) {
        this.privateEmail = privateEmail;
        this.privatePhone = privatePhone;
    }

    public String getPrivateEmail() {
        return privateEmail;
    }

    public void setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail;
    }

    public Phone getPrivatePhone() {
        return privatePhone;
    }

    public void setPrivatePhone(Phone privatePhone) {
        this.privatePhone = privatePhone;
    }


}

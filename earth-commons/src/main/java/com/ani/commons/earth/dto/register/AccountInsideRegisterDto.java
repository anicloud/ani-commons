package com.ani.commons.earth.dto.register;

import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-7-5.
 */
public class AccountInsideRegisterDto extends AniDto{

    private static final long serialVersionUID = -1322098736708118531L;

    private String privateEmail;
    private String privatePhone;
    private String orgEmail;

    public AccountInsideRegisterDto() {
    }

    public AccountInsideRegisterDto(String privateEmail, String privatePhone, String orgEmail) {
        this.privateEmail = privateEmail;
        this.privatePhone = privatePhone;
        this.orgEmail = orgEmail;
    }

    public String getPrivateEmail() {
        return privateEmail;
    }

    public void setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail;
    }

    public String getPrivatePhone() {
        return privatePhone;
    }

    public void setPrivatePhone(String privatePhone) {
        this.privatePhone = privatePhone;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }
}

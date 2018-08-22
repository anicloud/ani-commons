package com.ani.commons.earth.dto.organization;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-8-15.
 */
public class OrgMemberAuthDto implements Serializable{

    private static final long serialVersionUID = 7712733141002441521L;

    private String phone;
    private String privateEmail;

    public OrgMemberAuthDto(String phone, String privateEmail) {
        this.phone = phone;
        this.privateEmail = privateEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPrivateEmail() {
        return privateEmail;
    }

    public void setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail;
    }
}

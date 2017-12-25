package com.ani.commons.earth.dto;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.utils.dto.AniDto;

public class AniAccountAuthDto extends AniDto {

    String email;
    String phoneNum;
    String appUrl;

    public AniAccountAuthDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }
}

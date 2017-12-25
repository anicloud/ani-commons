package com.ani.commons.earth.dto;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.utils.dto.AniDto;

public class AniAuthStateDto extends AniDto {

    AuthState authState;
    String opUrl;
    String authCode;

    public AniAuthStateDto() {
    }

    public AuthState getAuthState() {
        return authState;
    }

    public void setAuthState(AuthState authState) {
        this.authState = authState;
    }

    public String getOpUrl() {
        return opUrl;
    }

    public void setOpUrl(String opUrl) {
        this.opUrl = opUrl;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}

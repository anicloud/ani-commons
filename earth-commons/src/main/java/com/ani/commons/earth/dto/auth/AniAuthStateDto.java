package com.ani.commons.earth.dto.auth;

import com.ani.commons.earth.enumeration.AuthOp;
import com.ani.commons.earth.enumeration.AuthState;

public class AniAuthStateDto {

    AuthState authState;
    AuthOp authOp;
    String authCode;

    public AniAuthStateDto() {
    }

    public AuthState getAuthState() {
        return authState;
    }

    public void setAuthState(AuthState authState) {
        this.authState = authState;
    }

    public AuthOp getAuthOp() {
        return authOp;
    }

    public void setAuthOp(AuthOp authOp) {
        this.authOp = authOp;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}

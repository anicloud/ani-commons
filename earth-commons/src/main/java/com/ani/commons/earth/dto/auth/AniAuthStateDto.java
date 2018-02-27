package com.ani.commons.earth.dto.auth;

import com.ani.commons.earth.enumeration.ContextType;
import com.ani.commons.earth.enumeration.AuthState;

public class AniAuthStateDto {

    AuthState authState;
    ContextType contextType;
    String authCode;

    public AniAuthStateDto() {
    }

    public AuthState getAuthState() {
        return authState;
    }

    public void setAuthState(AuthState authState) {
        this.authState = authState;
    }

    public ContextType getContextType() {
        return contextType;
    }

    public void setContextType(ContextType contextType) {
        this.contextType = contextType;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}

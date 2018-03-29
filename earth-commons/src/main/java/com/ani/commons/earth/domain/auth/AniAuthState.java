package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.ContextType;

/**
 * Created by zhanglina on 18-3-23.
 */
public abstract class AniAuthState {
    public AuthState authState;
    public ContextType contextType;
    public String tgt;

    public String getTgt() {
        return tgt;
    }

    public void setTgt(String tgt) {
        this.tgt = tgt;
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
}

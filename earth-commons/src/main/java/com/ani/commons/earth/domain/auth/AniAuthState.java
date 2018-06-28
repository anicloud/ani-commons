package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.ContextType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-23.
 */
public abstract class AniAuthState implements Serializable{
    private static final long serialVersionUID = 2983449220440400630L;

    protected AuthState authState;
    protected ContextType contextType;
    protected String aniSessionId;


    public AniAuthState() {
    }

    public AniAuthState(AuthState authState, ContextType contextType, String aniSessionId) {
        this.authState = authState;
        this.contextType = contextType;
        this.aniSessionId = aniSessionId;
    }

    public String getAniSessionId() {
        return aniSessionId;
    }

    public void setAniSessionId(String aniSessionId) {
        this.aniSessionId = aniSessionId;
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

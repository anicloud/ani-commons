package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.ContextType;

/**
 * Created by zhanglina on 18-4-8.
 */
public class AniSiteAuthState extends AniAuthState {
    String sessionId;

    public AniSiteAuthState() {
    }

    public AniSiteAuthState(AuthState authState,ContextType contextType,String tgt,String sessionId) {
        this.authState=authState;
        this.contextType=contextType;
        this.tgt=tgt;
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}

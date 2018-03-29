package com.ani.commons.earth.domain.auth;

/**
 * Created by zhanglina on 18-3-23.
 */
public class AccountSessionAuthState extends AniAuthState {
    String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }



}

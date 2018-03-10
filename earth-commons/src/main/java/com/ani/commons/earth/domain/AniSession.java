package com.ani.commons.earth.domain;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.utils.core.AniByte;

import java.util.Date;

public class AniSession {

    AniByte sessionId;
    AuthState authState;
    Date lastOp;

    public AniSession() {
    }

    public AniByte getSessionId() {
        return sessionId;
    }

    public void setSessionId(AniByte sessionId) {
        this.sessionId = sessionId;
    }


    public AuthState getAuthState() {
        return authState;
    }

    public void setAuthState(AuthState authState) {
        this.authState = authState;
    }

    public Date getLastOp() {
        return lastOp;
    }

    public void setLastOp(Date lastOp) {
        this.lastOp = lastOp;
    }
}

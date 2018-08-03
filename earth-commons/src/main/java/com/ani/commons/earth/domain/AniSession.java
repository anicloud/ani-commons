package com.ani.commons.earth.domain;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.CurUserType;

import java.io.Serializable;
import java.util.Date;

public class AniSession implements Serializable  {

    private static final long serialVersionUID = -7879345960994457975L;
    private String sessionId;
    private Long accountId;
    private Long orgAccountId;
    AuthState authState;

    public AniSession() {
    }
    public AniSession(String sessionId, Long accountId, Long orgAccountId, AuthState authState) {
        this.sessionId = sessionId;
        this.accountId = accountId;
        this.orgAccountId = orgAccountId;
        this.authState = authState;
    }

    public Long getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(Long orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public AuthState getAuthState() {
        return authState;
    }

    public void setAuthState(AuthState authState) {
        this.authState = authState;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}

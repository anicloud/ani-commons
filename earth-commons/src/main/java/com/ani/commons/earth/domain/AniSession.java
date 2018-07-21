package com.ani.commons.earth.domain;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.CurUserType;

import java.io.Serializable;
import java.util.Date;

public class AniSession implements Serializable  {

    private static final long serialVersionUID = -7879345960994457975L;
    public String sessionId;
    AuthState authState;
    CurUserType curUserType;
    Boolean isAdmin;
    Long accountId;

    public AniSession() {
    }

    public AniSession(String sessionId, AuthState authState, CurUserType curUserType, Boolean isAdmin, Long accountId) {
        this.sessionId = sessionId;
        this.authState = authState;
        this.curUserType = curUserType;
        this.isAdmin = isAdmin;
        this.accountId = accountId;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public CurUserType getCurUserType() {
        return curUserType;
    }

    public void setCurUserType(CurUserType curUserType) {
        this.curUserType = curUserType;
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

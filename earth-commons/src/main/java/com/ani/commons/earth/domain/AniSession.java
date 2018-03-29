package com.ani.commons.earth.domain;

import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.AuthState;
import com.ani.utils.core.AniByte;

import java.io.Serializable;
import java.util.Date;

public class AniSession implements Serializable  {

    private static final long serialVersionUID = -7879345960994457975L;
    public String sessionId;
    AuthState authState;
    AccountType accountType;
    Long accountId;
    String targetUrl;

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    Date lastOp;

    public AniSession() {
    }

    public AniSession(String sessionId, AuthState authState, AccountType accountType, Long accountId, Date lastOp) {
        this.sessionId = sessionId;
        this.authState = authState;
        this.accountType = accountType;
        this.accountId = accountId;
        this.lastOp = lastOp;
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

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Date getLastOp() {
        return lastOp;
    }

    public void setLastOp(Date lastOp) {
        this.lastOp = lastOp;
    }
}

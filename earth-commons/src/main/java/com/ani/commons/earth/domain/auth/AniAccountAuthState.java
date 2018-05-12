package com.ani.commons.earth.domain.auth;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-12.
 */
public class AniAccountAuthState extends AniAuthState implements Serializable {
    private static final long serialVersionUID = -2641021057324420725L;
    String sessionId;
    Long accountId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}

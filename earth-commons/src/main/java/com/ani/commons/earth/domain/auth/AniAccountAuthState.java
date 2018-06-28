package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.ContextType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-12.
 */
public class AniAccountAuthState extends AniAuthState implements Serializable {
    private static final long serialVersionUID = -2641021057324420725L;
    Long accountId;
    public AniAccountAuthState() {

    }
    public AniAccountAuthState(AuthState authState, ContextType contextType, String sessionId, Long accountId) {
        super(authState, contextType, sessionId);
        this.accountId = accountId;
    }
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

}

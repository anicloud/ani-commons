package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.ContextType;
import com.ani.commons.earth.enumeration.CurUserType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-23.
 */
public abstract class AniAuthState implements Serializable{
    private static final long serialVersionUID = 2983449220440400630L;

    protected AuthState authState;
    protected ContextType contextType;
    protected Long accountId;
    protected CurUserType userType;
    protected Boolean isAdmin;


    public AniAuthState(AuthState authState, ContextType contextType, Long accountId, CurUserType userType, Boolean isAdmin) {
        this.authState = authState;
        this.contextType = contextType;
        this.accountId = accountId;
        this.userType = userType;
        this.isAdmin = isAdmin;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public CurUserType getUserType() {
        return userType;
    }

    public void setUserType(CurUserType userType) {
        this.userType = userType;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public AniAuthState() {
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

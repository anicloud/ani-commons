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

    private Long accountId;

    private Long orgAccountId;

    private Boolean isAdmin;

    private AuthState authState;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(Long orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
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

    public AniAuthState(Long accountId, Long orgAccountId, Boolean isAdmin, AuthState authState) {
        this.accountId = accountId;
        this.orgAccountId = orgAccountId;
        this.isAdmin = isAdmin;
        this.authState = authState;
    }
}

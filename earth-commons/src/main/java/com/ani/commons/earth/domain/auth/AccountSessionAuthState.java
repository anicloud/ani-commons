package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.ContextType;

/**
 * Created by zhanglina on 18-3-23.
 */
public class AccountSessionAuthState extends AniAuthState {
    String targetUrl;

    public AccountSessionAuthState(){
        super();
    }
    public AccountSessionAuthState(AuthState authState, ContextType contextType, String tgt, String targetUrl) {
        super(authState, contextType, tgt);
        this.targetUrl = targetUrl;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}

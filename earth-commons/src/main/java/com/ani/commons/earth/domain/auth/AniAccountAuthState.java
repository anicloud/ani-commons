package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.ContextType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-12.
 */
public class AniAccountAuthState extends AniAuthState implements Serializable {
    private static final long serialVersionUID = -2641021057324420725L;
    String targetUrl;

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}

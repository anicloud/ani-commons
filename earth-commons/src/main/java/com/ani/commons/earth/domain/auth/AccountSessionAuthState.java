package com.ani.commons.earth.domain.auth;

/**
 * Created by zhanglina on 18-3-23.
 */
public class AccountSessionAuthState extends AniAuthState {
    String targetUrl;


    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}

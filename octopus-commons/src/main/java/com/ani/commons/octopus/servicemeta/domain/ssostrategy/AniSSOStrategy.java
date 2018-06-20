package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-22.
 */
public abstract class AniSSOStrategy implements Serializable {

    private static final long serialVersionUID = 732278579108449531L;
    protected Boolean isSSOLogout;
    protected String loginUrl;
    protected String logoutUrl;
    protected IntegrateType integrateType;
    protected String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Boolean getSSOLogout() {
        return isSSOLogout;
    }

    public void setSSOLogout(Boolean SSOLogout) {
        isSSOLogout = SSOLogout;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public IntegrateType getIntegrateType() {
        return integrateType;
    }

    public void setIntegrateType(IntegrateType integrateType) {
        this.integrateType = integrateType;
    }
}

package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.SubmitMethod;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-22.
 */
public class AniLDAPSafeTokenSSOStretagy implements Serializable {

    private static final long serialVersionUID = -5615155572542128935L;

    private String usernameField;
    private String passwordField;
    private SubmitMethod submitMethod;
    private String handlePage;
    private String proxyServerAddress;

    public String getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(String usernameField) {
        this.usernameField = usernameField;
    }

    public String getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(String passwordField) {
        this.passwordField = passwordField;
    }

    public SubmitMethod getSubmitMethod() {
        return submitMethod;
    }

    public void setSubmitMethod(SubmitMethod submitMethod) {
        this.submitMethod = submitMethod;
    }

    public String getHandlePage() {
        return handlePage;
    }

    public void setHandlePage(String handlePage) {
        this.handlePage = handlePage;
    }

    public String getProxyServerAddress() {
        return proxyServerAddress;
    }

    public void setProxyServerAddress(String proxyServerAddress) {
        this.proxyServerAddress = proxyServerAddress;
    }
}

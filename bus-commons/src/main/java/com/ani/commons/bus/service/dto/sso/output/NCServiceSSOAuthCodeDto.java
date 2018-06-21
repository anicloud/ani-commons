package com.ani.commons.bus.service.dto.sso.output;

/**
 * Created by zhanglina on 18-6-21.
 */
public class NCServiceSSOAuthCodeDto extends ServiceSSOAuthCodeDto {

    private static final long serialVersionUID = -7736336602671491339L;

    private String ssoKey;
    private String serviceUrl;

    public NCServiceSSOAuthCodeDto() {
    }

    public String getSsoKey() {
        return ssoKey;
    }

    public void setSsoKey(String ssoKey) {
        this.ssoKey = ssoKey;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }
}

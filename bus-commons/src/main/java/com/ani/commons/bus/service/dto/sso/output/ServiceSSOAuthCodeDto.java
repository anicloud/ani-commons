package com.ani.commons.bus.service.dto.sso.output;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-21.
 */
public class ServiceSSOAuthCodeDto implements Serializable {

    private static final long serialVersionUID = -6014303332784716211L;

    private String url;

    public ServiceSSOAuthCodeDto(String url) {
        this.url = url;
    }

    public ServiceSSOAuthCodeDto() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    //
}

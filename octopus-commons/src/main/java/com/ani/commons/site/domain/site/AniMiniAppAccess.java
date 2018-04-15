package com.ani.commons.site.domain.site;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-9.
 */
public class AniMiniAppAccess extends AniSiteAccess implements Serializable{

    private static final long serialVersionUID = 4972494957740193151L;

    public String appId;
    public String appSecret;

    public AniMiniAppAccess(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }

    public AniMiniAppAccess() {
        this.siteType = AniSiteType.MINIAPP;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    @Override
    protected AniSiteType getSiteType() {
        return this.siteType;
    }
}

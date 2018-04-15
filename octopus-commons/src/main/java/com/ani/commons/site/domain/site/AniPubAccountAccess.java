package com.ani.commons.site.domain.site;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-12.
 */
public class AniPubAccountAccess extends AniSiteAccess implements Serializable{

    private static final long serialVersionUID = -4100680109213756564L;

    public String appId;
    public String appSecret;

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

    public AniPubAccountAccess() {
        this.siteType=AniSiteType.PUBACCOUNT;
    }

    @Override
    protected AniSiteType getSiteType() {
        return this.siteType;
    }
}

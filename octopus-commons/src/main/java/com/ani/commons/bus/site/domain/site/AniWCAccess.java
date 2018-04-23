package com.ani.commons.bus.site.domain.site;

import com.ani.commons.bus.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-19.
 */
public class AniWCAccess extends AniSiteTypeAccess implements Serializable{

    private static final long serialVersionUID = -3996881239007645802L;

    private String appId;
    private String appSecret;

    public AniWCAccess() {
    }

    public AniWCAccess(String appId, String appSecret, AniSiteType aniSiteType) {
        this.appId = appId;
        this.appSecret = appSecret;
        this.aniSiteType = aniSiteType;
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
    public AniSiteType getAniSiteType() {
        return aniSiteType;
    }

    public void setAniSiteType(AniSiteType aniSiteType) {
        this.aniSiteType = aniSiteType;
    }
}

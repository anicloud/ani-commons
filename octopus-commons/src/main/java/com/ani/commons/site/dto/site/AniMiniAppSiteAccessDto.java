package com.ani.commons.site.dto.site;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-3.
 */
public class AniMiniAppSiteAccessDto extends AniSiteTypeAccessDto implements Serializable{

    private static final long serialVersionUID = 6035572641660547972L;

    private String appId;
    private String appSecret;

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

    public AniMiniAppSiteAccessDto() {
        this.aniSiteType= AniSiteType.MINIAPP;
    }

    @Override
    public AniSiteType getAniSiteType() {
        return this.aniSiteType;
    }
}

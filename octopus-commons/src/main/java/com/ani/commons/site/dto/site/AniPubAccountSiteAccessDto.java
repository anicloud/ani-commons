package com.ani.commons.site.dto.site;

import com.ani.commons.site.enumeration.AniSiteType;

/**
 * Created by zhanglina on 18-4-12.
 */
public class AniPubAccountSiteAccessDto extends AniSiteTypeAccessDto {

    private String appId;
    private String appSecret;

    public AniPubAccountSiteAccessDto() {
        this.aniSiteType= AniSiteType.PUBACCOUNT;
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
        return this.aniSiteType;
    }
}

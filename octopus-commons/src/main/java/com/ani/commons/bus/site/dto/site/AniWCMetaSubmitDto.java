package com.ani.commons.bus.site.dto.site;

import com.ani.commons.bus.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-19.
 */
public class AniWCMetaSubmitDto extends AniSiteTypeMetaSubmitDto implements Serializable{

    private static final long serialVersionUID = 6580314368771620447L;

    private AniSiteType aniSiteType;
    private String appId;
    private String appSecret;

    public AniWCMetaSubmitDto() {
    }
    public AniSiteType getAniSiteType() {
        return aniSiteType;
    }

    public void setAniSiteType(AniSiteType aniSiteType) {
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
}

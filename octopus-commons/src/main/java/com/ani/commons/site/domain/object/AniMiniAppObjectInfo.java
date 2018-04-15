package com.ani.commons.site.domain.object;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-12.
 */
public class AniMiniAppObjectInfo extends AniSiteObjectTypeInfo implements Serializable{

    private static final long serialVersionUID = -6105695589381641531L;

    private String openId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public AniMiniAppObjectInfo() {
        this.aniSiteType=AniSiteType.MINIAPP;
    }
    @Override
    public AniSiteType getAniSiteType() {
       return this.aniSiteType;
    }

}

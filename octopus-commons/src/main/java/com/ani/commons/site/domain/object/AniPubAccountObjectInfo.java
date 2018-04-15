package com.ani.commons.site.domain.object;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-12.
 */
public class AniPubAccountObjectInfo extends AniSiteObjectTypeInfo implements Serializable{

    private static final long serialVersionUID = 5177400236954835837L;

    private String openId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public AniPubAccountObjectInfo() {
        this.aniSiteType=AniSiteType.PUBACCOUNT;
    }

    @Override
    public AniSiteType getAniSiteType() {
        return this.aniSiteType;
    }
}

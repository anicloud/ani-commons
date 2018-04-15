package com.ani.commons.site.dto.object;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-12.
 */
public class AniMiniAppObjectInfoDto extends AniSiteObjectTypeInfoDto implements Serializable{

    private static final long serialVersionUID = -5763282513267409951L;

    private String openId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public AniMiniAppObjectInfoDto() {
        this.aniSiteType=AniSiteType.PUBACCOUNT;
    }

    @Override
    public AniSiteType getAniSiteType() {
        return this.aniSiteType;
    }
}

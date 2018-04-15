package com.ani.commons.site.dto.object;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-12.
 */
public class AniPubAccountObjectInfoDto extends AniSiteObjectTypeInfoDto implements Serializable {

    private static final long serialVersionUID = 8822432917091198016L;

    private String openId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Override
    protected AniSiteType getAniSiteType() {
        return this.aniSiteType;
    }
}

package com.ani.commons.site.dto.object;

import com.ani.commons.site.domain.object.AniSiteAccountObject;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-12.
 */
public class AniSiteObjectUpdateDto implements Serializable {
    
    private static final long serialVersionUID = -1575195260241234189L;
    
    private AniSiteObjectQueryDto objectQuery;
    private String openId;

    public AniSiteObjectUpdateDto() {
    }

    public AniSiteObjectQueryDto getObjectQuery() {
        return objectQuery;
    }

    public void setObjectQuery(AniSiteObjectQueryDto objectQuery) {
        this.objectQuery = objectQuery;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}

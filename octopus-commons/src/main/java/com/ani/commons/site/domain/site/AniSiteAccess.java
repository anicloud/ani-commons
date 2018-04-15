package com.ani.commons.site.domain.site;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-9.
 */
public abstract class AniSiteAccess implements Serializable {

    private static final long serialVersionUID = 4718059157322665260L;

    protected Long siteId;
    protected AniSiteType siteType;

    protected abstract AniSiteType getSiteType();

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }
}

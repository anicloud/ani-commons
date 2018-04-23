package com.ani.commons.bus.site.domain.site;

import com.ani.commons.bus.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-9.
 */
public abstract class AniSiteTypeAccess implements Serializable {

    private static final long serialVersionUID = 4718059157322665260L;

    protected Long modelId;
    protected AniSiteType aniSiteType;
    public abstract AniSiteType getAniSiteType();
    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }
}

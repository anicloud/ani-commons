package com.ani.commons.bus.site.domain.site;

import java.io.Serializable;
import java.util.List;

public class AniSite implements Serializable{

    protected static final long serialVersionUID = -491433898750149930L;

    protected Long modelId;
    protected List<AniSiteTypeAccess> aniSiteAccess;
    public AniSite() {

    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public List<AniSiteTypeAccess> getAniSiteAccess() {
        return aniSiteAccess;
    }

    public void setAniSiteAccess(List<AniSiteTypeAccess> aniSiteAccess) {
        this.aniSiteAccess = aniSiteAccess;
    }
}

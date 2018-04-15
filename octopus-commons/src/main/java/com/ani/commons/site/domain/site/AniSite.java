package com.ani.commons.site.domain.site;

import java.util.List;

public class AniSite {

    protected static final long serialVersionUID = -491433898750149930L;

    protected Long aniSiteId;
    protected String clientSecret;
    protected String version;
    protected Long modelId;
    protected List<AniSiteAccess> aniSiteAccess;
    public AniSite() {
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getAniSiteId() {
        return aniSiteId;
    }

    public void setAniSiteId(Long aniSiteId) {
        this.aniSiteId = aniSiteId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public List<AniSiteAccess> getAniSiteAccess() {
        return aniSiteAccess;
    }

    public void setAniSiteAccess(List<AniSiteAccess> aniSiteAccess) {
        this.aniSiteAccess = aniSiteAccess;
    }
}

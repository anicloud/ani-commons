package com.ani.commons.site.domain;

public class AniSite {
    // TODO: 18-4-2
    private static final long serialVersionUID = -491433898750149930L;
    private Long aniSiteId;
    private String siteSecret;
    private String appId;
    private String appSecret;
    private String name;
    private String version;
    private Long devAccountId;
    private Long ModelId;

    public String getSiteSecret() {
        return siteSecret;
    }

    public void setSiteSecret(String siteSecret) {
        this.siteSecret = siteSecret;
    }

    public Long getAniSiteId() {
        return aniSiteId;
    }

    public void setAniSiteId(Long aniSiteId) {
        this.aniSiteId = aniSiteId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getDevAccountId() {
        return devAccountId;
    }

    public void setDevAccountId(Long devAccountId) {
        this.devAccountId = devAccountId;
    }

    public Long getModelId() {
        return ModelId;
    }

    public void setModelId(Long modelId) {
        ModelId = modelId;
    }

    public AniSite() {
    }

    public AniSite(Long aniSiteId, String appId, String appSecret, String name, String version, Long devAccountId, Long modelId) {
        this.aniSiteId = aniSiteId;
        this.appId = appId;
        this.appSecret = appSecret;
        this.name = name;
        this.version = version;
        this.devAccountId = devAccountId;
        ModelId = modelId;
    }
}

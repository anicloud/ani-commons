package com.ani.commons.site.dto.site;

import java.util.List;

/**
 * Created by zhanglina on 18-4-2.
 */
public class AniSiteDto {

    private static final long serialVersionUID = 3999303477345956264L;

    private Long siteId;
    private String version;
    private Long modelId;
    private List<AniSiteTypeAccessDto> siteTypeAccess;

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public List<AniSiteTypeAccessDto> getSiteTypeInfo() {
        return siteTypeAccess;
    }

    public void setSiteTypeInfo(List<AniSiteTypeAccessDto> siteTypeInfo) {
        this.siteTypeAccess = siteTypeInfo;
    }
}

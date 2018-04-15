package com.ani.commons.site.dto.site;

import com.ani.utils.dto.AniDto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-4-12.
 */
public class AniSiteRegisterDto extends AniDto implements Serializable {

    private static final long serialVersionUID = -3515526624638828679L;

    private String version;
    private Long modelId;
    private List<AniSiteTypeAccessDto> siteTypeInfo;

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
        return siteTypeInfo;
    }

    public void setSiteTypeInfo(List<AniSiteTypeAccessDto> siteTypeInfo) {
        this.siteTypeInfo = siteTypeInfo;
    }

    public AniSiteRegisterDto() {
    }

    public AniSiteRegisterDto(String version, Long modelId, List<AniSiteTypeAccessDto> siteTypeInfo) {
        this.version = version;
        this.modelId = modelId;
        this.siteTypeInfo = siteTypeInfo;
    }
}

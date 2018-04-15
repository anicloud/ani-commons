package com.ani.commons.site.dto.object;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-12.
 */
public class AniSiteObjectQueryDto implements Serializable{
    
    private static final long serialVersionUID = -8262940439313005328L;
    
    private Long accountId;
    private Long siteId;
    private AniSiteType siteType;

    public AniSiteObjectQueryDto() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public AniSiteType getSiteType() {
        return siteType;
    }

    public void setSiteType(AniSiteType siteType) {
        this.siteType = siteType;
    }
}

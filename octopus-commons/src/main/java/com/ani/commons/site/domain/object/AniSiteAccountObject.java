package com.ani.commons.site.domain.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-4-4.
 */
public class AniSiteAccountObject implements Serializable {

    private static final long serialVersionUID = -7154464015660832292L;

    private Long ObjectId;
    private Long accountId;
    private Long siteId;
    private String unionId;
    private List<AniSiteObjectTypeInfo> objectTypeInfos;

    public Long getObjectId() {
        return ObjectId;
    }

    public void setObjectId(Long objectId) {
        ObjectId = objectId;
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

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public List<AniSiteObjectTypeInfo> getObjectTypeInfos() {
        return objectTypeInfos;
    }

    public void setObjectTypeInfos(List<AniSiteObjectTypeInfo> objectTypeInfos) {
        this.objectTypeInfos = objectTypeInfos;
    }
}

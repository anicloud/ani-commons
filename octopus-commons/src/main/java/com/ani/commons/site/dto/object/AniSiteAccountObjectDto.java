package com.ani.commons.site.dto.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-4-4.
 */
public class AniSiteAccountObjectDto implements Serializable{

    private static final long serialVersionUID = 891506072015904093L;

    private Long siteId;
    private Long accountId;
    private Long objectId;
    private String unionId;
    private byte[] token;
    private List<AniSiteObjectTypeInfoDto> objectTypeInfo;

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public AniSiteAccountObjectDto() {
    }

    public AniSiteAccountObjectDto(Long siteId, Long accountId, Long objectId, String unionId, List<AniSiteObjectTypeInfoDto> objectTypeInfo) {
        this.siteId = siteId;
        this.accountId = accountId;
        this.objectId = objectId;
        this.unionId = unionId;
        this.objectTypeInfo = objectTypeInfo;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public List<AniSiteObjectTypeInfoDto> getObjectTypeInfo() {
        return objectTypeInfo;
    }

    public void setObjectTypeInfo(List<AniSiteObjectTypeInfoDto> objectTypeInfo) {
        this.objectTypeInfo = objectTypeInfo;
    }

    public byte[] getToken() {
        return token;
    }

    public void setToken(byte[] token) {
        this.token = token;
    }
}

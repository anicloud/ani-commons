package com.ani.commons.bus.site.dto;

import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-11.
 */
public abstract class AniUserValidateDto extends AniDto implements Serializable{

    private static final long serialVersionUID = -6117485196819984439L;

//    protected Long siteId;
    protected String code;
//    protected Long accountId;

//    public Long getSiteId() {
//        return siteId;
//    }
//
//    public void setSiteId(Long siteId) {
//        this.siteId = siteId;
//    }

//    public Long getOwnerAccountId() {
//        return accountId;
//    }
//
//    public void setOwnerAccountId(Long accountId) {
//        this.accountId = accountId;
//    }
//
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AniUserValidateDto() {
    }

//    public AniUserValidateDto(Long siteId, String code, Long accountId) {
//        this.siteId = siteId;
//        this.code = code;
//        this.accountId = accountId;
//    }
}

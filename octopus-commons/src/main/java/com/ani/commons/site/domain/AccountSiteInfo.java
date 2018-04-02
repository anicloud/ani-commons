package com.ani.commons.site.domain;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-2.
 */
public class AccountSiteInfo implements Serializable {
    private static final long serialVersionUID = -7682648005973401545L;
    public Long AccountId;
    public String portrait;
    public String region;
    public Integer accessTimes;

    public AccountSiteInfo() {
    }

    public AccountSiteInfo(Long accountId, String portrait, String region, Integer accessTimes) {
        AccountId = accountId;
        this.portrait = portrait;
        this.region = region;
        this.accessTimes = accessTimes;
    }

    public Long getAccountId() {
        return AccountId;
    }

    public void setAccountId(Long accountId) {
        AccountId = accountId;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getAccessTimes() {
        return accessTimes;
    }

    public void setAccessTimes(Integer accessTimes) {
        this.accessTimes = accessTimes;
    }
}

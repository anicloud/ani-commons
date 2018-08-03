package com.ani.commons.earth.dto.account.organization;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-7-31.
 */
public class OrgAccountBriefDto implements Serializable{

    private static final long serialVersionUID = -6701275273811034396L;

    private Long orgAccountId;
    private String name;
    private String urlLogo;

    public OrgAccountBriefDto() {
    }

    public OrgAccountBriefDto(Long orgAccountId, String name, String urlLogo) {
        this.orgAccountId = orgAccountId;
        this.name = name;
        this.urlLogo = urlLogo;
    }

    public Long getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(Long orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }
}

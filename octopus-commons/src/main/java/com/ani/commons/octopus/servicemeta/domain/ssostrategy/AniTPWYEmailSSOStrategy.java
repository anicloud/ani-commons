package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPWYEmailSSOStrategy extends AniThirdPartySSOStrategy {

    private static final long serialVersionUID = 1275703786496501427L;

    private String adminKey;

    private String adminDomain;

    public AniTPWYEmailSSOStrategy() {
//        this.dealPage="/sso/neteaseEmail";
        this.partyType= ThirdPartyType.WYEMAIL;
    }

    public String getAdminKey() {
        return adminKey;
    }

    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }

    public String getAdminDomain() {
        return adminDomain;
    }

    public void setAdminDomain(String adminDomain) {
        this.adminDomain = adminDomain;
    }
}

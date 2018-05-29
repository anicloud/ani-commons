package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPCoreMailSSOStrategy extends AniThirdPartySSOStrategy {

    private static final long serialVersionUID = 2353476569250270316L;

    private String userType;

    private String adminLoginPage;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAdminLoginPage() {
        return adminLoginPage;
    }

    public void setAdminLoginPage(String adminLoginPage) {
        this.adminLoginPage = adminLoginPage;
    }

    public AniTPCoreMailSSOStrategy() {
//        this.dealPage="/";
        this.partyType= ThirdPartyType.COREMAIL;
    }

}

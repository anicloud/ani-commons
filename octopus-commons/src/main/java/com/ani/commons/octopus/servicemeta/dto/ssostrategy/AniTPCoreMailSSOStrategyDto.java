package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPCoreMailSSOStrategyDto extends AniThirdPartyStrategyDto {

    private static final long serialVersionUID = 1052457803040862519L;

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

    public AniTPCoreMailSSOStrategyDto() {
        this.dealPage="/";
        this.partyType= ThirdPartyType.COREMAIL;
    }
}

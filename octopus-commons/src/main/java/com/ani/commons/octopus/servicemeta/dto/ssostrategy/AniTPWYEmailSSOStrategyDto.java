package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPWYEmailSSOStrategyDto extends AniThirdPartyStrategyDto {

    private static final long serialVersionUID = -3585692447016858985L;

    private String adminKey;

    private String adminDomain;

    public AniTPWYEmailSSOStrategyDto() {
//        this.dealPage="/sso/neteaseEmail";
        this.partyType= ThirdPartyType.WYEMAIL;
    }

}

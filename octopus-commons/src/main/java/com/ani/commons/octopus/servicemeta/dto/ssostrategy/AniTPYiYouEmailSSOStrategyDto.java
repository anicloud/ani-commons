package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPYiYouEmailSSOStrategyDto extends AniThirdPartyStrategyDto {
    private static final long serialVersionUID = -3259140525728178876L;
    private String apiKey;
    private String apiSecret;
    private String suffixDomain;

    public AniTPYiYouEmailSSOStrategyDto() {
//        this.dealPage="/sso/Eu5";
        this.partyType= ThirdPartyType.YIYOUEMAIL;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public String getSuffixDomain() {
        return suffixDomain;
    }

    public void setSuffixDomain(String suffixDomain) {
        this.suffixDomain = suffixDomain;
    }
}

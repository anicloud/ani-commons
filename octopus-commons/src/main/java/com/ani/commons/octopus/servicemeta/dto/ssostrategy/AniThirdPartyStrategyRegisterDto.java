package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public abstract class AniThirdPartyStrategyRegisterDto extends AniSSOStrategyRegisterDto {

    private static final long serialVersionUID = -1480333872371904271L;
    protected ThirdPartyType partyType;
    protected String dealPage;

    public ThirdPartyType getPartyType() {
        return partyType;
    }

    public void setPartyType(ThirdPartyType partyType) {
        this.partyType = partyType;
    }

    public String getDealPage() {
        return dealPage;
    }

    public void setDealPage(String dealPage) {
        this.dealPage = dealPage;
    }
}

package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;
import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public abstract class AniThirdPartySSOStrategy extends AniSSOStrategy  {

    private static final long serialVersionUID = 8352794566772869761L;

    protected ThirdPartyType partyType;
    protected String dealPage;


    public AniThirdPartySSOStrategy() {
        this.integrateType = IntegrateType.THIRDPARTY;
    }

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

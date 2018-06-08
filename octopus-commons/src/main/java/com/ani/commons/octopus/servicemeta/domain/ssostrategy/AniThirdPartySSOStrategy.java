package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;
import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public abstract class AniThirdPartySSOStrategy extends AniSSOStrategy  {

    private static final long serialVersionUID = 8352794566772869761L;

    protected String dealPage;



    public String getDealPage() {
        return dealPage;
    }

    public void setDealPage(String dealPage) {
        this.dealPage = dealPage;
    }
}

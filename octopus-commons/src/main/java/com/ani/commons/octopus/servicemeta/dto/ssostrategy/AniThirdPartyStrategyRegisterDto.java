package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public abstract class AniThirdPartyStrategyRegisterDto extends AniSSOStrategyRegisterDto {

    private static final long serialVersionUID = -1480333872371904271L;
    protected String dealPage;

    public String getDealPage() {
        return dealPage;
    }

    public void setDealPage(String dealPage) {
        this.dealPage = dealPage;
    }
}

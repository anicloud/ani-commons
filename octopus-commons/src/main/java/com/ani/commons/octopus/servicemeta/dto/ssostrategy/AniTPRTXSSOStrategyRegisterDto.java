package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPRTXSSOStrategyRegisterDto extends AniThirdPartyStrategyRegisterDto {

    private static final long serialVersionUID = 5106262518837702981L;

    public AniTPRTXSSOStrategyRegisterDto() {
        this.partyType= ThirdPartyType.RTX;
    }
}

package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPNCSSOStrategyDto extends AniThirdPartyStrategyDto{

    private static final long serialVersionUID = -6500131113267794131L;

    public AniTPNCSSOStrategyDto() {
        this.partyType= ThirdPartyType.NC;
    }

}

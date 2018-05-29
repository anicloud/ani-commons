package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPNCSSOStrategy extends AniThirdPartySSOStrategy  {

    private static final long serialVersionUID = -4494417748050379206L;

    public AniTPNCSSOStrategy() {
//        this.dealPage="sso/nc";
        this.partyType= ThirdPartyType.NC;
    }

}

package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;
import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPRTXSSOStrategy extends AniThirdPartySSOStrategy{

    private static final long serialVersionUID = 1509171960268920260L;

    public AniTPRTXSSOStrategy() {
//       this.dealPage="/sso/RTX";
       this.integrateType= IntegrateType.RTX;
    }

}

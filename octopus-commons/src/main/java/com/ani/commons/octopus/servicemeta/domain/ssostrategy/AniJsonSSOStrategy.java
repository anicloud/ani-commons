package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;
import com.ani.commons.octopus.servicemeta.enumeration.SignType;

/**
 * Created by zhanglina on 18-5-22.
 */
public class AniJsonSSOStrategy extends AniSSOStrategy {

    private static final long serialVersionUID = 1518749856304709487L;

    public AniJsonSSOStrategy(){
        this.integrateType = IntegrateType.JSON;
    }
    private SignType signType;

    private Integer assertTimeoutMs;


}

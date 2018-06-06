package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;
import com.ani.commons.octopus.servicemeta.enumeration.SignType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-22.
 */
public class AniJsonSSOStrategyRegisterDto extends AniSSOStrategyRegisterDto implements Serializable{

    private static final long serialVersionUID = 4804332374262898221L;

    private SignType signType;

    private Integer assertTimeoutMs;

    public AniJsonSSOStrategyRegisterDto(){
        this.integrateType = IntegrateType.JSON;
    }

    public SignType getSignType() {
        return signType;
    }

    public void setSignType(SignType signType) {
        this.signType = signType;
    }

    public Integer getAssertTimeoutMs() {
        return assertTimeoutMs;
    }

    public void setAssertTimeoutMs(Integer assertTimeoutMs) {
        this.assertTimeoutMs = assertTimeoutMs;
    }
}

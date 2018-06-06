package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;
import com.ani.commons.octopus.servicemeta.enumeration.SignType;

/**
 * Created by zhanglina on 18-5-22.
 */
public class
AniSmalSSOStrategyRegisterDto extends AniSSOStrategyRegisterDto {
    private String idpName;
    private String idpNameFormat;
    private SignType signType;
    private Integer assertTimeoutMs;

    public String getIdpName() {
        return idpName;
    }

    public void setIdpName(String idpName) {
        this.idpName = idpName;
    }

    public String getIdpNameFormat() {
        return idpNameFormat;
    }

    public void setIdpNameFormat(String idpNameFormat) {
        this.idpNameFormat = idpNameFormat;
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

    public AniSmalSSOStrategyRegisterDto(){
        this.integrateType = IntegrateType.SAML;
    }


}

package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;
import com.ani.commons.octopus.servicemeta.enumeration.SignType;

/**
 * Created by zhanglina on 18-5-22.
 */
public class AniSamlSSOStrategy extends AniSSOStrategy {

    private static final long serialVersionUID = -6725762189820040902L;
    private String idpName;
    private String idpNameFormat;
    private SignType signType;
    private Integer assertTimeoutMs;

    public AniSamlSSOStrategy(){
        this.integrateType = IntegrateType.SAML;
    }

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
}

package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

/**
 * Created by zhanglina on 18-5-22.
 */
public class AniLTPASSOStrategy extends AniSSOStrategy {

    private static final long serialVersionUID = -8385458555592918492L;
    private String tokenName;
    private String secretKey;
    private String domain;

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}

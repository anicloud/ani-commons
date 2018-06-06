package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

/**
 * Created by zhanglina on 18-5-22.
 */
public class AniLTPASSOStrategyRegisterDto extends AniSSOStrategyRegisterDto {

    private static final long serialVersionUID = -3031131214601087261L;

    private String tokenName;
    private String secretKey;
    private String domain;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

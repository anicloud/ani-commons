package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPTencentEmailSSOStrategyRegisterDto extends AniThirdPartyStrategyRegisterDto {

    private static final long serialVersionUID = -6115883146280428055L;

    private String adminKey;

    private String adminDomain;

    private String serverAddress;

    private String apiAddress;

    public AniTPTencentEmailSSOStrategyRegisterDto() {
        this.partyType= ThirdPartyType.TENCENTEMAIL;
    }
}

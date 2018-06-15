package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;
import com.ani.commons.octopus.servicemeta.enumeration.ThirdPartyType;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniTPWYEmailSSOStrategyRegisterDto extends AniThirdPartyStrategyRegisterDto {

    private static final long serialVersionUID = -3585692447016858985L;

    private String adminKey;

    private String adminDomain;

    public AniTPWYEmailSSOStrategyRegisterDto() {
//        this.dealPage="/sso/neteaseEmail";
        this.integrateType= IntegrateType.WYEMAIL;
    }

}

package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.objmeta.dto.model.ModelQueryDto;
import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniFieldFormat;
import com.ani.utils.dto.AniPattern;
import com.ani.utils.dto.AniRequiredField;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-23.
 */
public abstract class AniSSOStrategyRegisterDto extends ModelQueryDto {

    private static final long serialVersionUID = 8386958343290101151L;
    @AniRequiredField
    protected Boolean isSSOLogout;
    @AniFieldFormat(pattern = AniPattern.URL_PATTERN)
    protected String loginUrl;
    @AniFieldFormat(pattern = AniPattern.URL_PATTERN)
    protected String logoutUrl;
    @AniRequiredField
    protected IntegrateType integrateType;
    // 应用基础地址
    public IntegrateType getIntegrateType() {
        return integrateType;
    }

    public void setIntegrateType(IntegrateType integrateType) {
        this.integrateType = integrateType;
    }

    public Boolean getSSOLogout() {
        return isSSOLogout;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public AniSSOStrategyRegisterDto(){}

    public AniSSOStrategyRegisterDto(Long modelId, Long requestAccountId, Boolean isSSOLogout, String loginUrl, String logoutUrl, IntegrateType integrateType) {
        super(modelId, requestAccountId);
        this.isSSOLogout = isSSOLogout;
        this.loginUrl = loginUrl;
        this.logoutUrl = logoutUrl;
        this.integrateType = integrateType;
    }
}

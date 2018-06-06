package com.ani.commons.octopus.servicemeta.dto.ssostrategy;

import com.ani.commons.octopus.objmeta.dto.model.ModelQueryDto;
import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-23.
 */
public abstract class AniSSOStrategyRegisterDto implements Serializable {

    private static final long serialVersionUID = 8386958343290101151L;

    protected Boolean isSSOLogout;
    protected String loginUrl;
    protected String logoutUrl;
    protected IntegrateType integrateType;
    protected ModelQueryDto modelQueryDto;

    public Boolean getSSOLogout() {
        return isSSOLogout;
    }

    public void setSSOLogout(Boolean SSOLogout) {
        isSSOLogout = SSOLogout;
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



    public ModelQueryDto getModelQueryDto() {
        return modelQueryDto;
    }

    public void setModelQueryDto(ModelQueryDto modelQueryDto) {
        this.modelQueryDto = modelQueryDto;
    }
}

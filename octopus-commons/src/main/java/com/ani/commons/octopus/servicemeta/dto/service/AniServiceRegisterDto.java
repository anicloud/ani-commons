package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelRegisterDto;
import com.ani.commons.octopus.servicemeta.enumeration.DualAuth;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.math.BigInteger;

/**
 * Created by zhanglina on 18-6-5.
 */
public  class AniServiceRegisterDto extends AniDto{

    private static final long serialVersionUID = 7816221974063283879L;
    @AniRequiredField
    protected String serviceType;
    @AniRequiredField
    protected DualAuth dualAuth;
    @AniRequiredField
    protected  ModelRegisterDto modelRegisterDto;
    @AniRequiredField
    protected String baseUrl;
    @AniRequiredField
   // protected BigInteger logoCurrent;
    private Integer orgId;
    public AniServiceRegisterDto(){}


    public AniServiceRegisterDto(String serviceType, DualAuth dualAuth, ModelRegisterDto modelRegisterDto, String baseUrl, Integer orgId) {
        this.serviceType = serviceType;
        this.dualAuth = dualAuth;
        this.modelRegisterDto = modelRegisterDto;
        this.baseUrl = baseUrl;
        this.orgId = orgId;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public ModelRegisterDto getModelRegisterDto() {
        return modelRegisterDto;
    }

    public void setModelRegisterDto(ModelRegisterDto modelRegisterDto) {
        this.modelRegisterDto = modelRegisterDto;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public DualAuth getDualAuth() {
        return dualAuth;
    }

    public void setDualAuth(DualAuth dualAuth) {
        this.dualAuth = dualAuth;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}

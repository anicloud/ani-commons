package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelRegisterDto;
import com.ani.commons.octopus.servicemeta.domain.service.AniService;
import com.ani.commons.octopus.servicemeta.enumeration.DualAuth;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-6-5.
 */
public class AniServiceRegisterDto extends AniDto{

    private static final long serialVersionUID = 7816221974063283879L;
    @AniRequiredField
    protected String serviceType;
    @AniRequiredField
    protected DualAuth dualAuth;
    @AniRequiredField
    protected  ModelRegisterDto modelRegisterDto;
    public AniServiceRegisterDto(){}
    public AniServiceRegisterDto(String serviceType, DualAuth dualAuth, ModelRegisterDto modelRegisterDto) {
        this.serviceType = serviceType;
        this.dualAuth = dualAuth;
        this.modelRegisterDto = modelRegisterDto;
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
}
package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelRegisterDto;
import com.ani.commons.octopus.servicemeta.domain.service.AniService;
import com.ani.commons.octopus.servicemeta.enumeration.DualAuth;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-6-5.
 */
public class AniServiceRegisterDto extends ModelRegisterDto{

    private static final long serialVersionUID = 7816221974063283879L;

    protected String serviceType;
    @AniRequiredField
    protected DualAuth dualAuth;

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

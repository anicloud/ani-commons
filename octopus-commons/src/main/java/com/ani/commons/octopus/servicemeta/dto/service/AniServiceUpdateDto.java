package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelUpdateDto;
import com.ani.commons.octopus.servicemeta.enumeration.DualAuth;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-6-5.
 */
public class AniServiceUpdateDto extends  ModelUpdateDto {
    private static final long serialVersionUID = -1887695056574931466L;

    @AniRequiredField
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

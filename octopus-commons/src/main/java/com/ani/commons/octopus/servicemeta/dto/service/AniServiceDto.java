package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.servicemeta.enumeration.Transparency;
import com.ani.commons.octopus.servicemeta.enumeration.DualAuth;
import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-5-22.
 */
public abstract class AniServiceDto extends AniDto{

    private static final long serialVersionUID = 2297358921824654904L;

    protected Transparency transparency;
    protected String serviceType;
    protected DualAuth dualAuth;

    public Transparency getTransparency() {
        return transparency;
    }

    public void setTransparency(Transparency transparency) {
        this.transparency = transparency;
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

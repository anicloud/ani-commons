package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.domain.ObjectModel;
import com.ani.commons.octopus.servicemeta.enumeration.Transparency;
import com.ani.commons.octopus.servicemeta.enumeration.DualAuth;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-31.
 */
public class AniServiceInfoDto implements Serializable {

    private static final long serialVersionUID = 1995190142525682784L;


    private ObjectModel objectModel;
    private String serviceType;
    private DualAuth dualAuth;

    public ObjectModel getObjectModel() {
        return objectModel;
    }

    public void setObjectModel(ObjectModel objectModel) {
        this.objectModel = objectModel;
    }

    public AniServiceInfoDto() {

    }

    public AniServiceInfoDto(String serviceType, DualAuth dualAuth) {
        this.serviceType = serviceType;
        this.dualAuth = dualAuth;
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

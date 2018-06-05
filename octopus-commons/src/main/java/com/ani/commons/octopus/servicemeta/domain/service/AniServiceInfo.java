package com.ani.commons.octopus.servicemeta.domain.service;

import com.ani.commons.octopus.objmeta.domain.ObjectModel;
import com.ani.commons.octopus.servicemeta.enumeration.Transparency;
import com.ani.commons.octopus.servicemeta.enumeration.TwoCertification;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-31.
 */
public class AniServiceInfo implements Serializable {

    private static final long serialVersionUID = 1995190142525682784L;

    private ObjectModel objectModel;

    private Transparency transparency;

    private String serviceType;

    private TwoCertification twoCertification;

    public ObjectModel getObjectModel() {
        return objectModel;
    }

    public void setObjectModel(ObjectModel objectModel) {
        this.objectModel = objectModel;
    }

    public AniServiceInfo() {

    }

    public AniServiceInfo(Transparency transparency, String serviceType, TwoCertification twoCertification) {
        this.transparency = transparency;
        this.serviceType = serviceType;
        this.twoCertification = twoCertification;
    }

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

    public TwoCertification getTwoCertification() {
        return twoCertification;
    }

    public void setTwoCertification(TwoCertification twoCertification) {
        this.twoCertification = twoCertification;
    }
}

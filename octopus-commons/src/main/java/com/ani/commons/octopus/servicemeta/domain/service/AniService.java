package com.ani.commons.octopus.servicemeta.domain.service;

import com.ani.commons.octopus.objmeta.domain.ObjectModel;
import com.ani.commons.octopus.servicemeta.domain.ssostrategy.AniSSOStrategy;
import com.ani.commons.octopus.servicemeta.enumeration.Transparency;
import com.ani.commons.octopus.servicemeta.enumeration.DualAuth;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniService implements Serializable {

    private static final long serialVersionUID = 7067512857059614105L;

    private ObjectModel objectModel;
    private String serviceType;
    private DualAuth dualAuth;
    private AniSSOStrategy ssoStrategy;
    private AniDataSynStrategy aniDataSynStrategy;

    public AniService(){}
    public AniService(ObjectModel objectModel,String serviceType,DualAuth daulAuth,AniSSOStrategy ssoStrategy,AniDataSynStrategy aniDataSynStrategy){
        this.objectModel = objectModel;
        this.serviceType = serviceType;
        this.dualAuth = daulAuth;
        this.ssoStrategy = ssoStrategy;
        this.aniDataSynStrategy = aniDataSynStrategy;
    }

    public AniDataSynStrategy getAniDataSynStrategy() {
        return aniDataSynStrategy;
    }

    public void setAniDataSynStrategy(AniDataSynStrategy aniDataSynStrategy) {
        this.aniDataSynStrategy = aniDataSynStrategy;
    }

    public ObjectModel getObjectModel() {
        return objectModel;
    }

    public void setObjectModel(ObjectModel objectModel) {
        this.objectModel = objectModel;
    }

    public AniSSOStrategy getSsoStrategy() {
        return ssoStrategy;
    }

    public void setSsoStrategy(AniSSOStrategy ssoStrategy) {
        this.ssoStrategy = ssoStrategy;
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

package com.ani.commons.octopus.servicemeta.domain.service;

import com.ani.commons.octopus.objmeta.domain.ObjectModel;
import com.ani.commons.octopus.servicemeta.domain.ssostrategy.AniSSOStrategy;
import com.ani.commons.octopus.servicemeta.enumeration.Transparency;
import com.ani.commons.octopus.servicemeta.enumeration.DualAuth;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.Timestamp;
import java.sql.Date;

/**
 * Created by zhanglina on 18-5-23.
 */
public class ServiceModel implements Serializable {

    private static final long serialVersionUID = 7067512857059614105L;

    private ObjectModel objectModel;
    private String serviceType;
    private DualAuth dualAuth;
    private AniSSOStrategy ssoStrategy;
    private AniDataSynStrategy aniDataSynStrategy;
    private Date createDate;
    private Date updateDate;
    private String baseUrl;

    public ServiceModel() {
    }

    public ServiceModel(ObjectModel objectModel, String serviceType, DualAuth dualAuth, AniSSOStrategy ssoStrategy, AniDataSynStrategy aniDataSynStrategy, Date createDate, Date updateDate, String baseUrl) {
        this.objectModel = objectModel;
        this.serviceType = serviceType;
        this.dualAuth = dualAuth;
        this.ssoStrategy = ssoStrategy;
        this.aniDataSynStrategy = aniDataSynStrategy;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.baseUrl = baseUrl;
    }


    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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

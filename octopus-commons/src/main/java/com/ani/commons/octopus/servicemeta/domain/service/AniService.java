package com.ani.commons.octopus.servicemeta.domain.service;

import com.ani.commons.octopus.servicemeta.domain.ssostrategy.AniSSOStrategy;
import com.ani.commons.octopus.servicemeta.enumeration.Transparency;
import com.ani.commons.octopus.servicemeta.enumeration.TwoCertification;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-23.
 */
public class AniService implements Serializable {

    private static final long serialVersionUID = 7067512857059614105L;

//    private ObjectModel objectModel;

    private Long modelId;

    private String modelName;

    private String desc;

    private String detail;

    private String logoFileType;

    private Transparency transparency;

    private String serviceType;

    private TwoCertification twoCertification;

    private AniSSOStrategy ssoStrategy;

//    public ObjectModel getObjectModel() {
//        return objectModel;
//    }
//
//    public void setObjectModel(ObjectModel objectModel) {
//        this.objectModel = objectModel;
//    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public AniSSOStrategy getSsoStrategy() {
        return ssoStrategy;
    }

    public void setSsoStrategy(AniSSOStrategy ssoStrategy) {
        this.ssoStrategy = ssoStrategy;
    }

    public String getLogoFileType() {
        return logoFileType;
    }

    public void setLogoFileType(String logoFileType) {
        this.logoFileType = logoFileType;
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

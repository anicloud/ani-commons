package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.domain.ObjectModel;
import com.ani.commons.octopus.servicemeta.enumeration.Transparency;
import com.ani.commons.octopus.servicemeta.enumeration.DualAuth;
import com.fasterxml.jackson.databind.node.BigIntegerNode;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

/**
 * Created by zhanglina on 18-5-31.
 */
public class AniServiceInfoDto implements Serializable {

    private static final long serialVersionUID = 1995190142525682784L;


    private ObjectModel objectModel;
    private String serviceType;
    private DualAuth dualAuth;
    private Date createDate;
    private Date updateDate;
    private String logoPath;
    private String baseUrl;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ObjectModel getObjectModel() {
        return objectModel;
    }

    public void setObjectModel(ObjectModel objectModel) {
        this.objectModel = objectModel;
    }

    public AniServiceInfoDto() {
    }

    public AniServiceInfoDto(ObjectModel objectModel, String serviceType, DualAuth dualAuth, Date createDate, Date updateDate, String baseUrl) {
        this.objectModel = objectModel;
        this.serviceType = serviceType;
        this.dualAuth = dualAuth;
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

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
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

package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.domain.ObjectModel;
import com.ani.commons.octopus.servicemeta.enumeration.Transparency;
import com.ani.commons.octopus.servicemeta.enumeration.DualAuth;

import java.io.Serializable;
import java.security.Timestamp;

/**
 * Created by zhanglina on 18-5-31.
 */
public class AniServiceInfoDto implements Serializable {

    private static final long serialVersionUID = 1995190142525682784L;


    private ObjectModel objectModel;
    private String serviceType;
    private DualAuth dualAuth;
    private Timestamp createDate;
    private Timestamp updateDate;
    private String logoPath;




    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ObjectModel getObjectModel() {
        return objectModel;
    }

    public void setObjectModel(ObjectModel objectModel) {
        this.objectModel = objectModel;
    }

    public      AniServiceInfoDto() {
    }

    public AniServiceInfoDto(ObjectModel objectModel, String serviceType, DualAuth dualAuth, Timestamp createDate, Timestamp updateDate) {
        this.objectModel = objectModel;
        this.serviceType = serviceType;
        this.dualAuth = dualAuth;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
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

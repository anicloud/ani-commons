package com.ani.commons.octopus.servicemeta.dto.service.Object;

import java.io.Serializable;
import java.security.Principal;

/**
 * Created by zhanglina on 18-6-28.
 */
public class ServiceObjBriefInfoDto implements Serializable{

    private static final long serialVersionUID = 1660770102672262611L;

    private Long objectId;
    private Long name;
    private Long modelId;
    private String logo;

    public ServiceObjBriefInfoDto() {
    }

    public ServiceObjBriefInfoDto(Long objectId, Long name, Long modelId, String logo) {
        this.objectId = objectId;
        this.name = name;
        this.modelId = modelId;
        this.logo = logo;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}

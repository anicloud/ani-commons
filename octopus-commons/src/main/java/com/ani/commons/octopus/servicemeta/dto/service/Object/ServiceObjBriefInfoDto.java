package com.ani.commons.octopus.servicemeta.dto.service.Object;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.security.Principal;

/**
 * Created by zhanglina on 18-6-28.
 */
public class ServiceObjBriefInfoDto implements Serializable{

    private static final long serialVersionUID = 1660770102672262611L;
    @JsonSerialize(using= ToStringSerializer.class)
    private Long objectId;
    private String name;
    @JsonSerialize(using= ToStringSerializer.class)
    private Long modelId;
    private String logo;
    private String url;
    public ServiceObjBriefInfoDto() {
    }

    public ServiceObjBriefInfoDto(Long objectId, String name, Long modelId, String logo, String url) {
        this.objectId = objectId;
        this.name = name;
        this.modelId = modelId;
        this.logo = logo;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}

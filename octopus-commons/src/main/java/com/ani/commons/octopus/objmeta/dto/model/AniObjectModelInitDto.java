package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.octopus.objmeta.object.ObjectType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-19.
 */
public abstract class AniObjectModelInitDto implements Serializable {
    private Long modelId;
    private String name;
    private String token;
    protected ObjectType objectType;
    public abstract ObjectType getObjectType();
    public AniObjectModelInitDto() {
    }
    public AniObjectModelInitDto(Long modelId, String name, String token) {
        this.modelId = modelId;
        this.name = name;
        this.token = token;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

package com.ani.commons.octopus.object.dto.objmodel;

import com.ani.commons.octopus.object.enumeration.AniObjectType;
import com.ani.utils.core.AniByte;
import com.ani.utils.dto.AniDto;

/**
 * @author yeh
 */
public class AniObjModelMetaDto extends AniDto {

    Long modelId;

    String name;

    AniByte[] token;

    String description;

    AniObjectType objectType;

    Long devAccountId;

    public AniObjModelMetaDto() {
    }

    public AniObjModelMetaDto(Long modelId, String name, AniByte[] token, String description, AniObjectType objectType, Long devAccountId) {
        this.modelId = modelId;
        this.name = name;
        this.token = token;
        this.description = description;
        this.objectType = objectType;
        this.devAccountId = devAccountId;
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

    public AniByte[] getToken() {
        return token;
    }

    public void setToken(AniByte[] token) {
        this.token = token;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AniObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(AniObjectType objectType) {
        this.objectType = objectType;
    }

    public Long getDevAccountId() {
        return devAccountId;
    }

    public void setDevAccountId(Long devAccountId) {
        this.devAccountId = devAccountId;
    }
}

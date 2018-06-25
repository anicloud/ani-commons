package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

public class ObjectInitDto extends AniDto {

    private static final long serialVersionUID = -9024030952112129525L;

    private Long objectId;
    private Long modelId;
    private String name;
    private Long ownerAccountId;

    public ObjectInitDto() {
    }

    public ObjectInitDto(Long objectId, Long modelId, String name, Long ownerAccountId) {
        this.objectId = objectId;
        this.modelId = modelId;
        this.name = name;
        this.ownerAccountId = ownerAccountId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
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

    public Long getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }
}

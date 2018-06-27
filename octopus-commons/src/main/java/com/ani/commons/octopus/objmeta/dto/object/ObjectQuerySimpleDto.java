package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.commons.octopus.objmeta.domain.ObjectType;

public class ObjectQuerySimpleDto extends ObjectQueryDto {

    private  Long objectId;

    public ObjectQuerySimpleDto() {
    }

    public ObjectQuerySimpleDto(Long opAccountId, ObjectType type, Long objectId) {
        super(opAccountId, type);
        this.objectId = objectId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }
}

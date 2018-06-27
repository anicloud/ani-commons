package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.utils.dto.AniRequiredField;

public class ObjectQueryOwnerDto extends ObjectQueryDto {

    @AniRequiredField
    private Long ownerAccountId;

    public ObjectQueryOwnerDto() {
        super();
    }

    public ObjectQueryOwnerDto(Long opAccountId, ObjectType type, Long ownerAccountId) {
        super(opAccountId, type);
        this.ownerAccountId = ownerAccountId;
    }

    public Long getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }
}

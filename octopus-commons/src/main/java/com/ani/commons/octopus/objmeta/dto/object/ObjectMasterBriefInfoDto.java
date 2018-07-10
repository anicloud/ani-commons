package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.utils.core.AniByte;
import com.ani.utils.core.data.type.ConnState;
import com.ani.utils.dto.AniDto;

import java.util.Map;

public class ObjectMasterBriefInfoDto extends ObjectInfoDto {

    private Long objectId;
    private Long ownerAccountId;
    private Integer orgId;

    public ObjectMasterBriefInfoDto() {
        super();
    }

    public ObjectMasterBriefInfoDto(String name, String modelName, ObjectType type, Long objectId, Long ownerAccountId, Integer orgId) {
        super(name, modelName, type);
        this.objectId = objectId;
        this.ownerAccountId = ownerAccountId;
        this.orgId = orgId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}

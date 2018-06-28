package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-3-29.
 */
public abstract class ObjectQueryDto extends AniDto {

    private static final long serialVersionUID = 8152487956326966853L;

    @AniRequiredField
    private Long opAccountId;
    private ObjectType objType;

    public ObjectQueryDto() {
    }

    public ObjectQueryDto(Long opAccountId, ObjectType objType) {
        this.opAccountId = opAccountId;
        this.objType = objType;
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

    public ObjectType getObjType() {
        return objType;
    }

    public void setObjType(ObjectType objType) {
        this.objType = objType;
    }
}

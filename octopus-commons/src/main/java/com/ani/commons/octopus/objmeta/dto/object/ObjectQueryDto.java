package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectQueryDto extends AniDto {

    private static final long serialVersionUID = 8152487956326966853L;

    private Long objectId;

    public ObjectQueryDto() {}

    public ObjectQueryDto(Long objectId) {
        this.objectId = objectId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }
}

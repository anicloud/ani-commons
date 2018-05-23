package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectInfoUpdateDto extends AniDto {

    private static final long serialVersionUID = -1565345687060065809L;

    private Long objectId;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }
}

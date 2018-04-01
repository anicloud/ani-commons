package com.ani.commons.octopus.dto.object;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectQueryDto implements Serializable {
    private static final long serialVersionUID = 8152487956326966853L;
    private Long ObjectId;

    public Long getObjectId() {
        return ObjectId;
    }

    public void setObjectId(Long objectId) {
        ObjectId = objectId;
    }
}

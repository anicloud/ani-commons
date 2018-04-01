package com.ani.commons.octopus.dto.object;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectUpdateDto implements Serializable {

    private static final long serialVersionUID = -1565345687060065809L;

    private Long objectId;
    private String name;
    private Long modelId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }
}

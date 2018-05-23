package com.ani.commons.octopus.objmeta.domain;

import com.ani.utils.core.AniByte;

import java.io.Serializable;

public class AniObjectRegisterInfo implements Serializable {

    private static final long serialVersionUID = 4395572270868642594L;

    private Long modelId;
    private Long objectId;
    private AniByte token;

    public AniObjectRegisterInfo() {
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

    public AniByte getToken() {
        return token;
    }

    public void setToken(AniByte token) {
        this.token = token;
    }
}

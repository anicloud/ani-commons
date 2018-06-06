package com.ani.commons.octopus.servicemeta.dto.service;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-1.
 */
public class AniServiceBasicInfoDto implements Serializable {

    private static final long serialVersionUID = -7926819973737697307L;

    private Long modelId;
    private String modelName;
    private String loginUrl;

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }
}

package com.ani.commons.bus.site.dto.site;

import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-19.
 */
public class AniSiteConnectDto extends AniDto implements Serializable {
    private static final long serialVersionUID = -961463858710366497L;
    private Long modelId;
    private String token;

    public AniSiteConnectDto() {
    }

    public AniSiteConnectDto(Long modelId, String token) {
        this.modelId = modelId;
        this.token = token;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}

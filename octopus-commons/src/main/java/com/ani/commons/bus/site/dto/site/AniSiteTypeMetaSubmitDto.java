package com.ani.commons.bus.site.dto.site;

import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-19.
 */
public abstract class AniSiteTypeMetaSubmitDto extends AniDto implements Serializable {
    private static final long serialVersionUID = 418010821417841639L;
    private Long modelId;

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

}

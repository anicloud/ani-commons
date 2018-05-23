package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-4-19.
 */
public abstract class ModelDto extends AniDto {

    private static final long serialVersionUID = 271223444264428728L;

    /**
     * Indicated by Octopus
     */
    @AniRequiredField
    private Long modelId;

    public ModelDto() {
    }

    public ModelDto(Long modelId) {
        this.modelId = modelId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }
}

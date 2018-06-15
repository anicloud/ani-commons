package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.utils.core.DataState;
import com.ani.utils.dto.AniRequiredField;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * Created by zhanglina on 18-4-19.
 */
public class ModelStateUpdateDto extends ModelDto {

    private static final long serialVersionUID = 271223444264428728L;

    @AniRequiredField
    @JsonSerialize(using = ToStringSerializer.class)
    public Long opAccountId;
    @AniRequiredField
    public DataState modelState;

    public ModelStateUpdateDto() {
    }

    public ModelStateUpdateDto(Long modelId, Long opAccountId, DataState modelState) {
        super(modelId);
        this.opAccountId = opAccountId;
        this.modelState = modelState;
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

    public DataState getModelState() {
        return modelState;
    }

    public void setModelState(DataState modelState) {
        this.modelState = modelState;
    }
}

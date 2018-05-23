package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.utils.core.DataState;

/**
 * Created by zhanglina on 18-4-19.
 */
public class ModelBriefInfoDto extends ModelDto {

    private static final long serialVersionUID = 1557755280949239636L;

    private String name;
    private ObjectType type;
    private DataState modelState;

    public ModelBriefInfoDto() {
    }

    public ModelBriefInfoDto(Long modelId, String name, ObjectType type, DataState modelState) {
        super(modelId);
        this.name = name;
        this.type = type;
        this.modelState = modelState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectType getType() {
        return type;
    }

    public void setType(ObjectType type) {
        this.type = type;
    }

    public DataState getModelState() {
        return modelState;
    }

    public void setModelState(DataState modelState) {
        this.modelState = modelState;
    }
}

package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.utils.core.AniByte;
import com.ani.utils.core.data.type.ConnState;
import com.ani.utils.dto.AniDto;

import java.util.Map;

public abstract class ObjectInfoDto extends AniDto {

    private String name;
    private String modelName;
    private ObjectType type;

    public ObjectInfoDto() {}

    public ObjectInfoDto(String name, String modelName, ObjectType type) {
        this.name = name;
        this.modelName = modelName;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ObjectType getType() {
        return type;
    }

    public void setType(ObjectType type) {
        this.type = type;
    }
}

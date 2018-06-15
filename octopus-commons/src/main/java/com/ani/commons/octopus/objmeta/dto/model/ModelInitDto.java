package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.octopus.objmeta.domain.ObjectType;

/**
 * Created by zhanglina on 18-4-19.
 */
public class ModelInitDto extends ModelDto {

    private static final long serialVersionUID = 271223444264428728L;

    /**
     * Unique name of model indicated by user
     * SUGGESTED: English only
     */
    private String name;
    /**
     * Calculated token, once display
     */
    private String token;
    private ObjectType type;

    public ModelInitDto() {
    }

    public ModelInitDto(Long modelId, String name, String token, ObjectType type) {
        super(modelId);
        this.name = name;
        this.token = token;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ObjectType getType() {
        return type;
    }

    public void setType(ObjectType type) {
        this.type = type;
    }
}

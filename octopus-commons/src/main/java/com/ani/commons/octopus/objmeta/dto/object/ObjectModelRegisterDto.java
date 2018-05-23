package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.commons.octopus.objmeta.domain.ObjectType;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectModelRegisterDto extends ObjectRegisterDto {

    private static final long serialVersionUID = -7893713192108329556L;

    private ObjectType type;

    public ObjectModelRegisterDto() {}

    public ObjectModelRegisterDto(ObjectType type) {
        this.type = type;
    }

    public ObjectType getType() {
        return type;
    }

    public void setType(ObjectType type) {
        this.type = type;
    }
}

package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;
import com.ani.utils.exception.AniRuleException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.validation.constraints.NotNull;

/**
 * Created by zhanglina on 18-4-20.
 */
public class ModelRegisterDto extends AniDto {

    private static final long serialVersionUID = 147262414461427098L;

    @AniRequiredField
    protected String name;
    protected String briefDesc;
    protected String description;
    @AniRequiredField
    @JsonSerialize(using = ToStringSerializer.class)
    protected Long devAccountId;
    @AniRequiredField
    protected ObjectType objectType;

    public ModelRegisterDto() {
    }

    public ModelRegisterDto(String name, String briefDesc, String description, Long devAccountId, ObjectType objectType) {
        this.name = name;
        this.briefDesc = briefDesc;
        this.description = description;
        this.devAccountId = devAccountId;
        this.objectType = objectType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDevAccountId() {
        return devAccountId;
    }

    public void setDevAccountId(Long devAccountId) {
        this.devAccountId = devAccountId;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }
}

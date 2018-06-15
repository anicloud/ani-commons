package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.utils.core.Operation;
import com.ani.utils.dto.AniRequiredField;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class ModelUpdateDto extends ModelDto {

    private static final long serialVersionUID = -5809111207521868666L;

    @AniRequiredField
    private String name;
    @AniRequiredField
    private String briefDesc;
    @AniRequiredField
    private String description;
    @AniRequiredField
    private Operation updateOp;
    @AniRequiredField
    @JsonSerialize(using = ToStringSerializer.class)
    private Long opAccountId;

    public ModelUpdateDto() {
    }

    public ModelUpdateDto(Long modelId, String name, String briefDesc, String description, Operation updateOp, Long opAccountId) {
        super(modelId);
        this.name = name;
        this.briefDesc = briefDesc;
        this.description = description;
        this.updateOp = updateOp;
        this.opAccountId = opAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Operation getUpdateOp() {
        return updateOp;
    }

    public void setUpdateOp(Operation updateOp) {
        this.updateOp = updateOp;
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }
}

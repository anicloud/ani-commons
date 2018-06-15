package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * Created by zhanglina on 18-4-19.
 */
public class ModelQueryDto extends ModelDto {

    private static final long serialVersionUID = 271223444264428728L;
    @JsonSerialize(using = ToStringSerializer.class)
    private Long requestAccountId;

    public ModelQueryDto() {
    }

    public ModelQueryDto(Long modelId, Long requestAccountId) {
        super(modelId);
        this.requestAccountId = requestAccountId;
    }

    public Long getRequestAccountId() {
        return requestAccountId;
    }

    public void setRequestAccountId(Long requestAccountId) {
        this.requestAccountId = requestAccountId;
    }
}

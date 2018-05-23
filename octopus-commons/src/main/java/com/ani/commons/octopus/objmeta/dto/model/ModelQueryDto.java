package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.octopus.objmeta.domain.ObjectType;

/**
 * Created by zhanglina on 18-4-19.
 */
public class ModelQueryDto extends ModelDto {

    private static final long serialVersionUID = 271223444264428728L;

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

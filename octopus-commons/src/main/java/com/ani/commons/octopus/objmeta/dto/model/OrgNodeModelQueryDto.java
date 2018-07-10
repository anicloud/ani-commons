package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.utils.dto.AniRequiredField;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * Created by zhanglina on 18-5-23.
 */
public class OrgNodeModelQueryDto extends OrgModelOpDto {

    private static final long serialVersionUID = 2423825827389972278L;

    @AniRequiredField
    @JsonSerialize(using = ToStringSerializer.class)
    private Long nodeId;

    public OrgNodeModelQueryDto() {
    }

    public OrgNodeModelQueryDto(Integer orgId, Long opAccountId, Long nodeId) {
        super(orgId, opAccountId);
        this.nodeId = nodeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }
}

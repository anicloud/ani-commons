package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-5-23.
 */
public class OrgNodeModelQueryDto extends OrgModelOpDto {

    private static final long serialVersionUID = 2423825827389972278L;

    @AniRequiredField
    private Long nodeId;

    public OrgNodeModelQueryDto() {
    }

    public OrgNodeModelQueryDto(Long orgId, Long opAccountId, Long nodeId) {
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

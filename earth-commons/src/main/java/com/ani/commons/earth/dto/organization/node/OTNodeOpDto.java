package com.ani.commons.earth.dto.organization.node;

import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OTNodeOpDto extends AniDto implements Serializable {
    private static final long serialVersionUID = 3610668615086024460L;
    private Long nodeId;
    private Long opEmployeeId;

    public OTNodeOpDto(Long nodeId, Long opEmployeeId) {
        this.nodeId = nodeId;
        this.opEmployeeId = opEmployeeId;
    }

    public OTNodeOpDto() {
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getOpEmployeeId() {
        return opEmployeeId;
    }

    public void setOpEmployeeId(Long opEmployeeId) {
        this.opEmployeeId = opEmployeeId;
    }
}

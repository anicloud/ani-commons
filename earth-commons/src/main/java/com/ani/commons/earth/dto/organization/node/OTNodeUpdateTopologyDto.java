package com.ani.commons.earth.dto.organization.node;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-2.
 * Last Modified by xuben on 18-7-26.
 */
public class OTNodeUpdateTopologyDto implements Serializable {
    private static final long serialVersionUID = -8038150633677883643L;

    private Long nodeId;

    private Long targetParentNodeId;

    public OTNodeUpdateTopologyDto(Long nodeId, Long targetParentNodeId) {
        this.nodeId = nodeId;
        this.targetParentNodeId = targetParentNodeId;
    }

    public OTNodeUpdateTopologyDto() {
    }

    public Long getTargetParentNodeId() {
        return targetParentNodeId;
    }

    public void setTargetParentNodeId(Long targetParentNodeId) {
        this.targetParentNodeId = targetParentNodeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }
}

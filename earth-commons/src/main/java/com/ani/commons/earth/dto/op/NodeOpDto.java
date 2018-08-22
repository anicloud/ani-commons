package com.ani.commons.earth.dto.op;

/**
 * Created by changhan on 18-8-22.
 */
public class NodeOpDto extends GroupOpDto{
    private Long nodeId;

    public NodeOpDto() {
    }

    public NodeOpDto(Long opAccountId, Long privacyGroupId, Long nodeId) {
        super(opAccountId, privacyGroupId);
        this.nodeId = nodeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

}

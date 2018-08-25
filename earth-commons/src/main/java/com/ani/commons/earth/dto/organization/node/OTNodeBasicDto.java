package com.ani.commons.earth.dto.organization.node;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by zhanglina on 18-5-8.
 * Last Modified by xuben on 18-7-26.
 */
public class OTNodeBasicDto implements Serializable {

    private static final long serialVersionUID = 5178457830140115174L;

    private Long parentNodeId;

    private Long nodeId;

    private List<Long> children;

    public OTNodeBasicDto() {
    }

    public OTNodeBasicDto(Long parentNodeId, Long nodeId, List<Long> children) {
        this.parentNodeId = parentNodeId;
        this.nodeId = nodeId;
        this.children = children;
    }


    public Long getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Long parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public List<Long> getChildren() {
        return children;
    }

    public void setChildren(List<Long> children) {
        this.children = children;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nodeId);
    }

    @Override
    public boolean equals(Object obj) {

        return this.hashCode() == obj.hashCode();
    }
}


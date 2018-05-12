package com.ani.commons.earth.domain.organization.tree;

import com.ani.commons.earth.enumeration.organization.NodeType;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OTNodeDetail implements Serializable {

    private static final long serialVersionUID = 8353889266002670534L;
    private Long nodeId;
    private String name;
    private NodeType nodeType;
    private Long parentId;
    private boolean canDeploy;

    public boolean isCanDeploy() {
        return canDeploy;
    }

    public void setCanDeploy(boolean canDeploy) {
        this.canDeploy = canDeploy;
    }

    private Timestamp createTime;
    private Timestamp updateTime;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
//    public Set<organization> getChildren() {
//        return children;
//    }
//
//    public void setChildren(Set<organization> children) {
//        this.children = children;
//    }
}

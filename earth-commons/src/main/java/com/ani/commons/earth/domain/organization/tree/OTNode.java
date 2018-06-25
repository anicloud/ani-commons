package com.ani.commons.earth.domain.organization.tree;

import com.ani.commons.earth.enumeration.organization.NodeType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OTNode implements Serializable {
    private static final long serialVersionUID = 5520644352781449962L;
    private String nodeId;
    private String name;
    private NodeType nodeType;
    private String privilege;
    private Boolean canDeploy;
    private Boolean hasChildren;
    private List<OTNode> children;
    private String parentNodeId;

    public String getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OTNode> getChildren() {
        return children;
    }

    public void setChildren(List<OTNode> children) {
        this.children = children;
    }

    public Boolean getCanDeploy() {
        return canDeploy;
    }

    public void setCanDeploy(Boolean canDeploy) {
        this.canDeploy = canDeploy;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}

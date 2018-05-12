package com.ani.commons.earth.domain.organization.tree;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OTNode implements Serializable {
    private static final long serialVersionUID = 5520644352781449962L;
    private String nodeId;
    private String name;
    private Boolean canDeploy;
    private List<OTNode> children;
    public String getNodeId() {
        return nodeId;
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
}

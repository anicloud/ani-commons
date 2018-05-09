package com.ani.commons.bus.earth.dto.organization.node;

import com.ani.commons.bus.earth.enumeration.organization.NodeType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OTNodeUpdateInfoDto implements Serializable {

    private static final long serialVersionUID = -785050925216131990L;

    private OTNodeOpDto otNodeOpDto;
    private NodeType nodeType;
    private String name;

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public OTNodeOpDto getOtNodeOpDto() {
        return otNodeOpDto;
    }

    public void setOtNodeOpDto(OTNodeOpDto otNodeOpDto) {
        this.otNodeOpDto = otNodeOpDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

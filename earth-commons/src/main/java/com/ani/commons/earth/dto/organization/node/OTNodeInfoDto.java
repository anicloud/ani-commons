package com.ani.commons.earth.dto.organization.node;

import com.ani.commons.earth.enumeration.organization.NodeType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-8.
 */
public class OTNodeInfoDto implements Serializable {

    private static final long serialVersionUID = 5178457830140115174L;

    private String name;
    private NodeType nodeType;
    private OTNodeOpDto otNodeOpDto;

    public OTNodeInfoDto() {
    }

    public OTNodeInfoDto(String name, NodeType nodeType, OTNodeOpDto otNodeOpDto) {
        this.name = name;
        this.nodeType = nodeType;
        this.otNodeOpDto = otNodeOpDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}

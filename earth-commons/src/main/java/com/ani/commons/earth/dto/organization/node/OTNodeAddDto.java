package com.ani.commons.earth.dto.organization.node;

import com.ani.commons.earth.enumeration.organization.NodeType;
import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OTNodeAddDto extends AniDto implements Serializable {

    private static final long serialVersionUID = -463500843397755139L;
    private Integer orgId;
    private String name;
    private NodeType type;
    private OTNodeOpDto otNodeOpDto;

    public OTNodeAddDto(Integer orgId, String name, NodeType type, OTNodeOpDto otNodeOpDto) {
        this.orgId = orgId;
        this.name = name;
        this.type = type;
        this.otNodeOpDto = otNodeOpDto;
    }

    public OTNodeAddDto() {
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeType getType() {
        return type;
    }

    public void setType(NodeType type) {
        this.type = type;
    }

    public OTNodeOpDto getOtNodeOpDto() {
        return otNodeOpDto;
    }

    public void setOtNodeOpDto(OTNodeOpDto otNodeOpDto) {
        this.otNodeOpDto = otNodeOpDto;
    }
}

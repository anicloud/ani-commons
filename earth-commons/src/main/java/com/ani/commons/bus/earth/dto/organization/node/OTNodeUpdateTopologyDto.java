package com.ani.commons.bus.earth.dto.organization.node;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OTNodeUpdateTopologyDto implements Serializable {
    private static final long serialVersionUID = -8038150633677883643L;

    private Long targetParentNodeId;

    private OTNodeOpDto otNodeOpDto;

    public OTNodeOpDto getOtNodeOpDto() {
        return otNodeOpDto;
    }

    public void setOtNodeOpDto(OTNodeOpDto otNodeOpDto) {
        this.otNodeOpDto = otNodeOpDto;
    }

    public Long getTargetParentNodeId() {
        return targetParentNodeId;
    }

    public void setTargetParentNodeId(Long targetParentNodeId) {
        this.targetParentNodeId = targetParentNodeId;
    }
}
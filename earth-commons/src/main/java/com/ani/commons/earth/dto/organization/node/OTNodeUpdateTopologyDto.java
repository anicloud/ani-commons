package com.ani.commons.earth.dto.organization.node;

import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-5-2.
 * Last Modified by xuben on 18-7-31.
 */
public class OTNodeUpdateTopologyDto extends OTNodeAdminOpDto {

    private static final long serialVersionUID = -8038150633677883643L;

    @AniRequiredField
    private Long targetParentNodeId;

    public OTNodeUpdateTopologyDto() {
    }

    public OTNodeUpdateTopologyDto(Long opAccountId, Long targetNodeGroupId, Long targetParentNodeId) {
        super(opAccountId, targetNodeGroupId);
        this.targetParentNodeId = targetParentNodeId;
    }

    public Long getTargetParentNodeId() {
        return targetParentNodeId;
    }

    public void setTargetParentNodeId(Long targetParentNodeId) {
        this.targetParentNodeId = targetParentNodeId;
    }

}

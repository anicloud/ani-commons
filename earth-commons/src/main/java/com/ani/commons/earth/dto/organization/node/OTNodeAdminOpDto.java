package com.ani.commons.earth.dto.organization.node;

import com.ani.commons.earth.dto.op.OpDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by changhan on 18-8-23.
 */
public abstract class OTNodeAdminOpDto extends OpDto {

    @AniRequiredField
    private Long targetNodeGroupId;

    public OTNodeAdminOpDto() {
    }

    public OTNodeAdminOpDto(Long opAccountId, Long targetNodeGroupId) {
        super(opAccountId);
        this.targetNodeGroupId = targetNodeGroupId;
    }

    public Long getTargetNodeGroupId() {
        return targetNodeGroupId;
    }

    public void setTargetNodeGroupId(Long targetNodeGroupId) {
        this.targetNodeGroupId = targetNodeGroupId;
    }


}

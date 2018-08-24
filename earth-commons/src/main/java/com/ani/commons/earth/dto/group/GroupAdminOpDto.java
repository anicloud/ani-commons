package com.ani.commons.earth.dto.group;

import com.ani.commons.earth.dto.op.GroupOpByPrivilegeDto;
import com.ani.commons.earth.dto.op.GroupOpDto;
import com.ani.commons.earth.dto.op.OpDto;
import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by changhan on 18-8-19.
 */
public abstract class GroupAdminOpDto extends GroupOpByPrivilegeDto {

    private Long targetGroupId;

    public GroupAdminOpDto() {
        super.setPrivilege(PrivilegeType.ADMIN);
    }

    public GroupAdminOpDto(
            Long opAccountId,
            Long privilegeGroupId,
            Long targetGroupId) {
        super(opAccountId, privilegeGroupId, PrivilegeType.ADMIN);
        this.targetGroupId = targetGroupId;
    }

    public Long getTargetGroupId() {
        return targetGroupId;
    }

    public void setTargetGroupId(Long targetGroupId) {
        this.targetGroupId = targetGroupId;
    }
}

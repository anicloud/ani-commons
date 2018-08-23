package com.ani.commons.earth.dto.op;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by changhan on 18-8-22.
 */
public abstract class GroupOpDto extends OpDto {

    private Long privilegeGroupId;

    public GroupOpDto() {
    }

    public GroupOpDto(Long opAccountId, Long privilegeGroupId) {
        super(opAccountId);
        this.privilegeGroupId = privilegeGroupId;
    }

    public Long getPrivilegeGroupId() {
        return privilegeGroupId;
    }

    public void setPrivilegeGroupId(Long groupId) {
        this.privilegeGroupId = groupId;
    }
}

package com.ani.commons.earth.dto.group;

import com.ani.commons.earth.dto.op.GroupOpByPrivilegeDto;
import com.ani.utils.core.data.type.PrivilegeType;

/**
 * Created by changhan on 18-8-24.
 */
public class GroupPrivilegeDto extends GroupOpByPrivilegeDto {
    public GroupPrivilegeDto() {
    }

    public GroupPrivilegeDto(Long opAccountId, Long privilegeGroupId, PrivilegeType privilege) {
        super(opAccountId, privilegeGroupId, privilege);
    }
}

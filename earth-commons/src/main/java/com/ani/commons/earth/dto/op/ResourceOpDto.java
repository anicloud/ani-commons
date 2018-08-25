package com.ani.commons.earth.dto.op;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by changhan on 18-8-25.
 */
public class ResourceOpDto extends OpDto {

    @AniRequiredField
    private Long resourceAccountId;

    private PrivilegeType privilegeType;

    public ResourceOpDto() {
    }

    public ResourceOpDto(Long opAccountId, Long resourceAccountId, PrivilegeType privilegeType) {
        super(opAccountId);
        this.resourceAccountId = resourceAccountId;
        this.privilegeType = privilegeType;
    }

    public Long getResourceAccountId() {
        return resourceAccountId;
    }

    public void setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
    }

    public PrivilegeType getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(PrivilegeType privilegeType) {
        this.privilegeType = privilegeType;
    }
}

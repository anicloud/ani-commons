package com.ani.commons.earth.dto.organization.node;

import com.ani.commons.earth.dto.account.AccessibilityDto;
import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-14.
 */
public class OrgAccessibilityDto extends AccessibilityDto {

    private static final long serialVersionUID = -3327642775366338199L;

    private Long resourceNodeId;

    public OrgAccessibilityDto(Long requestAccountId, PrivilegeType privilegeType, Long resourceNodeId) {
        super(requestAccountId, privilegeType);
        this.resourceNodeId = resourceNodeId;
    }

    public Long getResourceNodeId() {
        return resourceNodeId;
    }

    public void setResourceNodeId(Long resourceNodeId) {
        this.resourceNodeId = resourceNodeId;
    }


}

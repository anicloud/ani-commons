package com.ani.commons.earth.dto.organization.node;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-14.
 */
public class CheckOrgResourceAccessDto extends AniDto{

    private static final long serialVersionUID = -3327642775366338199L;

    private Long requestAccountId;
    private Long resourceNodeId;
    private PrivilegeType privilegeType;

    public Long getRequestAccountId() {
        return requestAccountId;
    }

    public void setRequestAccountId(Long requestAccountId) {
        this.requestAccountId = requestAccountId;
    }

    public Long getResourceNodeId() {
        return resourceNodeId;
    }

    public void setResourceNodeId(Long resourceNodeId) {
        this.resourceNodeId = resourceNodeId;
    }

    public PrivilegeType getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(PrivilegeType privilegeType) {
        this.privilegeType = privilegeType;
    }
    
}

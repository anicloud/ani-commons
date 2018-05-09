package com.ani.commons.bus.earth.dto.organization.role;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.core.data.type.TransparencyType;
import com.ani.utils.dto.AniDto;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OrgAccountRoleDto extends AniDto implements Serializable {

    private static final long serialVersionUID = 3389168006262797060L;

    private Long orgId;
    private String name;

    private Map<TransparencyType, Set<PrivilegeType>> privileges;

    private Long opAccountId;

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<TransparencyType, Set<PrivilegeType>> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Map<TransparencyType, Set<PrivilegeType>> privileges) {
        this.privileges = privileges;
    }
}

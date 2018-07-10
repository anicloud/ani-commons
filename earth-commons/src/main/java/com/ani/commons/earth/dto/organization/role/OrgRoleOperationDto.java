package com.ani.commons.earth.dto.organization.role;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-3.
 */
public class OrgRoleOperationDto implements Serializable{

    private static final long serialVersionUID = 3178420750739059849L;
    private Integer orgId;
    private Long roleId;
    private Long opAccountId;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }
}

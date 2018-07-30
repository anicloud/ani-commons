package com.ani.commons.earth.dto.organization.node;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OTNodeMemberDto implements Serializable {

    private static final long serialVersionUID = 482087522594463817L;

    private Long roleId;
    private Long targetEmployeeId;
    public OTNodeMemberDto() {
    }


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }



    public Long getTargetEmployeeId() {
        return targetEmployeeId;
    }

    public void setTargetEmployeeId(Long targetEmployeeId) {
        this.targetEmployeeId = targetEmployeeId;
    }
}


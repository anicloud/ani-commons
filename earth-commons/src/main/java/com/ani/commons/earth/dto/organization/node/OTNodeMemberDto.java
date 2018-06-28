package com.ani.commons.earth.dto.organization.node;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OTNodeMemberDto implements Serializable {

    private static final long serialVersionUID = 482087522594463817L;

    private Long roleId;
    private OTNodeOpDto otNodeOpDto;
    private Long targetEmployeeId;
    public OTNodeMemberDto() {
    }

    public OTNodeMemberDto(Long roleId, OTNodeOpDto otNodeOpDto, Long targetEmployeeId) {
        this.roleId = roleId;
        this.otNodeOpDto = otNodeOpDto;
        this.targetEmployeeId = targetEmployeeId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public OTNodeOpDto getOtNodeOpDto() {
        return otNodeOpDto;
    }

    public void setOtNodeOpDto(OTNodeOpDto otNodeOpDto) {
        this.otNodeOpDto = otNodeOpDto;
    }

    public Long getTargetEmployeeId() {
        return targetEmployeeId;
    }

    public void setTargetEmployeeId(Long targetEmployeeId) {
        this.targetEmployeeId = targetEmployeeId;
    }
}


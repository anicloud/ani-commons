package com.ani.commons.earth.dto.op;

/**
 * Created by changhan on 18-8-22.
 */
public class CheckOpPrivilegeDto extends NodeOpDto{
    private Long orgAccountId;

    public CheckOpPrivilegeDto() {

    }

    public CheckOpPrivilegeDto(Long opAccountId, Long privacyGroupId, Long nodeId, Long orgAccountOpDto) {
        super(opAccountId, privacyGroupId, nodeId);
        this.orgAccountId = orgAccountOpDto;
    }

    public Long getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(Long orgAccountOpDto) {
        this.orgAccountId = orgAccountOpDto;
    }
}

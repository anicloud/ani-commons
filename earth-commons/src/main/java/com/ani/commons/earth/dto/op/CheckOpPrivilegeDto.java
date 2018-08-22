package com.ani.commons.earth.dto.op;

/**
 * Created by changhan on 18-8-22.
 */
public class CheckOpPrivilegeDto extends NodeOpDto{
    private Long orgAccountId;

    public CheckOpPrivilegeDto() {

    }

    public CheckOpPrivilegeDto(Long opAccountId, Long privacyGroupId, Long nodeId, Long orgaccountOpDto) {
        super(opAccountId, privacyGroupId, nodeId);
        this.orgAccountId = orgaccountOpDto;
    }

    public Long getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(Long orgaccountOpDto) {
        this.orgAccountId = orgaccountOpDto;
    }
}

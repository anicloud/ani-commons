package com.ani.commons.earth.dto.account.organization;

import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-7-17.
 */
public class OrgMemberQueryDto extends AniDto {
    private static final long serialVersionUID = -8895996549350890621L;
    public Long employeeId;
    private Long opAccountId;

    public OrgMemberQueryDto(Long employeeId, Long opAccountId) {
        this.employeeId = employeeId;
        this.opAccountId = opAccountId;
    }

    public OrgMemberQueryDto() {
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }
}

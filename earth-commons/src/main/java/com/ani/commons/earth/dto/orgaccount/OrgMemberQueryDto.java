package com.ani.commons.earth.dto.orgaccount;

import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-7-17.
 */
public class OrgMemberQueryDto extends AniDto {
    private static final long serialVersionUID = -8895996549350890621L;
    public Long employeeId;
    private Long opEmployeeId;

    public OrgMemberQueryDto(Long employeeId, Long opEmployeeId) {
        this.employeeId = employeeId;
        this.opEmployeeId = opEmployeeId;
    }

    public OrgMemberQueryDto() {
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getOpEmployeeId() {
        return opEmployeeId;
    }

    public void setOpEmployeeId(Long opEmployeeId) {
        this.opEmployeeId = opEmployeeId;
    }
}

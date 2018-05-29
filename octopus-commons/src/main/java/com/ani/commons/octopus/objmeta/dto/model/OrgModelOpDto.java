package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-5-23.
 */
public abstract class OrgModelOpDto extends AniDto {

    private static final long serialVersionUID = -566072220949496414L;

    @AniRequiredField
    private Long orgId;
    @AniRequiredField
    private Long opAccountId;

    public OrgModelOpDto() {
    }

    public OrgModelOpDto(Long orgId, Long opAccountId) {
        this.orgId = orgId;
        this.opAccountId = opAccountId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }
}

package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectRegisterForOrgDto extends ObjectRegisterDto {

    private static final long serialVersionUID = -7893713192108329556L;

    @AniRequiredField
    private Long orgId;

    public ObjectRegisterForOrgDto() {
        super();
    }

    public ObjectRegisterForOrgDto(Long orgId, String name, Long ownerAccountId, Long orgId1) {
        super(orgId, name, ownerAccountId);
        this.orgId = orgId1;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}
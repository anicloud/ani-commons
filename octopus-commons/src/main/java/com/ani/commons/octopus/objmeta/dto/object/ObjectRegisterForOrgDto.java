package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectRegisterForOrgDto extends ObjectRegisterDto {

    private static final long serialVersionUID = -7893713192108329556L;

    @AniRequiredField
    private Integer orgId;

    public ObjectRegisterForOrgDto() {
        super();
    }

    public ObjectRegisterForOrgDto(Long modelId, String name, Long ownerAccountId, Integer orgId) {
        super(modelId, name, ownerAccountId);
        this.orgId = orgId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}
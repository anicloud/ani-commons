package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.utils.core.data.type.PrivacyType;

import java.util.Set;

/**
 * Created by zhanglina on 18-6-25.
 */
public class OrgModelAccessCheckDto extends ModelQueryDto {
    private Long orgId;
    private Set<PrivacyType> expPrivacy;
    
    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
    
}

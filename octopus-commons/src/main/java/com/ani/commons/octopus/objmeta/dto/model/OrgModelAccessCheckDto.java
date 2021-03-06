package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.utils.core.data.type.PrivacyType;
import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniRequiredField;

import java.util.Set;

/**
 * Created by zhanglina on 18-6-25.
 */
public class OrgModelAccessCheckDto extends ModelQueryDto {
    @AniRequiredField
    private Integer orgId;
    private Set<PrivilegeType> expPrivilege;

    public OrgModelAccessCheckDto() {
    }

    public OrgModelAccessCheckDto(Long modelId, Long requestAccountId, Integer orgId, Set<PrivilegeType> expPrivilege) {
        super(modelId, requestAccountId);
        this.orgId = orgId;
        this.expPrivilege = expPrivilege;
    }

    public Set<PrivilegeType> getExpPrivilege() {
        return expPrivilege;
    }

    public void setExpPrivilege(Set<PrivilegeType> expPrivilege) {
        this.expPrivilege = expPrivilege;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
    
}

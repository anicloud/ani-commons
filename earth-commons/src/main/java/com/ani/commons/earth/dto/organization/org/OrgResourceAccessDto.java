package com.ani.commons.earth.dto.organization.org;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniDto;

import java.util.Set;

/**
 * Created by zhanglina on 18-6-25.
 */
public class OrgResourceAccessDto extends AniDto{

    private static final long serialVersionUID = 1362390761162759832L;

    private Long accountId;
    private Long orgId;
    private Set<PrivilegeType> privilegeTypes;

    public OrgResourceAccessDto(Long accountId, Long orgId, Set<PrivilegeType> privilegeTypes) {
        this.accountId = accountId;
        this.orgId = orgId;
        this.privilegeTypes = privilegeTypes;
    }

    public OrgResourceAccessDto() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Set<PrivilegeType> getPrivilegeTypes() {
        return privilegeTypes;
    }

    public void setPrivilegeTypes(Set<PrivilegeType> privilegeTypes) {
        this.privilegeTypes = privilegeTypes;
    }
}

package com.ani.commons.earth.dto.account.organization;

import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-7-17.
 * Last Modified by xuben on 18-8-6.
 */
public class OrgMemberQueryDto extends AniDto {
    private static final long serialVersionUID = -8895996549350890621L;
    public Long accountId;
    private Long nodeId;
    private Long orgAccountId;

    public OrgMemberQueryDto(Long orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    public OrgMemberQueryDto(Long accountId, Long nodeId, Long orgAccountId) {
        this.accountId = accountId;
        this.nodeId = nodeId;
        this.orgAccountId = orgAccountId;
    }

    public OrgMemberQueryDto(Long accountId, Long nodeId) {
        this.accountId = accountId;
        this.nodeId = nodeId;
    }

    public OrgMemberQueryDto() {
    }

    public Long getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(Long orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }
}

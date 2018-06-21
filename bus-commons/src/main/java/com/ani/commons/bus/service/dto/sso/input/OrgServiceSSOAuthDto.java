package com.ani.commons.bus.service.dto.sso.input;

/**
 * Created by zhanglina on 18-6-21.
 */
public class OrgServiceSSOAuthDto extends ServiceSSOAuthDto {

    private static final long serialVersionUID = -6838893841045646062L;
    private Long orgId;
    public OrgServiceSSOAuthDto(Long modelId, Long accountId,Long orgId) {
        super(modelId, accountId);
        this.orgId =orgId;
    }

    public OrgServiceSSOAuthDto() {

    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}

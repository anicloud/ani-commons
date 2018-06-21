package com.ani.commons.bus.service.dto.sso.input;

import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-6-21.
 */
public abstract class ServiceSSOAuthDto extends AniDto{

    private static final long serialVersionUID = -6734549774437930125L;

    private Long modelId;
//    private Long orgId;
    private Long accountId;

    public ServiceSSOAuthDto(Long modelId, Long accountId) {
        this.modelId = modelId;
        this.accountId = accountId;
    }

    public ServiceSSOAuthDto() {
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}

package com.ani.commons.bus.service.dto.sso.input;

import com.ani.commons.octopus.objmeta.dto.model.ModelQueryDto;
import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-6-21.
 */
public abstract class ServiceSSOAuthDto  {

    private static final long serialVersionUID = -6734549774437930125L;

    private Long objectId;
    private Long requestAccountId;

    public ServiceSSOAuthDto() {
    }

    public ServiceSSOAuthDto(Long objectId, Long requestAccountId) {
        this.objectId = objectId;
        this.requestAccountId = requestAccountId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getRequestAccountId() {
        return requestAccountId;
    }

    public void setRequestAccountId(Long requestAccountId) {
        this.requestAccountId = requestAccountId;
    }
}

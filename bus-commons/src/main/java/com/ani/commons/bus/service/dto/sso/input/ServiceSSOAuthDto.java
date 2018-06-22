package com.ani.commons.bus.service.dto.sso.input;

import com.ani.commons.octopus.objmeta.dto.model.ModelQueryDto;
import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-6-21.
 */
public abstract class ServiceSSOAuthDto extends ModelQueryDto {

    private static final long serialVersionUID = -6734549774437930125L;

    public ServiceSSOAuthDto(Long modelId, Long accountId) {
        super(modelId, accountId);
    }

    public ServiceSSOAuthDto() {
    }
}

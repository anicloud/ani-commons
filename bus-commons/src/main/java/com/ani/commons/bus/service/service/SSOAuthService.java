package com.ani.commons.bus.service.service;

import com.ani.commons.bus.service.dto.sso.output.ServiceSSOAuthCodeDto;
import com.ani.commons.bus.service.dto.sso.input.ServiceSSOAuthDto;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

/**
 * Created by zhanglina on 18-6-21.
 */
public interface SSOAuthService {
    /**
     * <h2>This is a single sign on method</h2>
     * @param serviceSSOAuthDto
     * @return loginUrl
     * @throws AniRuleException
     * @throws AniDataException
     */
    public ServiceSSOAuthCodeDto ssoAuth(ServiceSSOAuthDto serviceSSOAuthDto) throws AniRuleException, AniDataException;
}

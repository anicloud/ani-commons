package com.ani.commons.bus.service.service;

import com.ani.commons.bus.service.dto.sso.output.ServiceSSOAuthCodeDto;
import com.ani.commons.bus.service.dto.sso.input.ServiceSSOAuthDto;

/**
 * Created by zhanglina on 18-6-21.
 */
public interface SSOAuthService {
    public ServiceSSOAuthCodeDto ssoAuth(ServiceSSOAuthDto serviceSSOAuthDto);
}

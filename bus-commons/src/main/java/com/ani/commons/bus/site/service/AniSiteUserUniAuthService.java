package com.ani.commons.bus.site.service;

import com.ani.commons.earth.domain.auth.AniAccountAuthState;
import com.ani.commons.bus.site.dto.AniUserValidateDto;
import com.ani.utils.exception.AniRuleException;

/**
 * Created by zhanglina on 18-4-11.
 */
public interface AniSiteUserUniAuthService {
    public AniAccountAuthState auth(AniUserValidateDto aniUserValidateDto) throws AniRuleException;
}

package com.ani.commons.site.service;

import com.ani.commons.site.dto.AniUserValidateDto;
import com.ani.utils.exception.AniRuleException;

/**
 * Created by zhanglina on 18-4-11.
 */
public interface AniSiteUserUniAuthService {
    public void login(AniUserValidateDto aniUserValidateDto) throws AniRuleException;
}

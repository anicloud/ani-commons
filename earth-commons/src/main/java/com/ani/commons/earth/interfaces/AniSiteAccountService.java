package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.auth.AniSiteAuthState;
import com.ani.utils.exception.AniRuleException;

/**
 * Created by zhanglina on 18-4-8.
 */
public interface AniSiteAccountService{
    public AniSiteAuthState login(Long aniSiteId,Long accountId)throws AniRuleException;
    public void checkSession(String aniSessionId,Long aniSiteId) throws AniRuleException;
}

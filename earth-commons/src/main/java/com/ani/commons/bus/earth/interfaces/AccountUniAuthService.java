package com.ani.commons.bus.earth.interfaces;

import com.ani.commons.bus.earth.domain.auth.AccountSessionAuthState;
import com.ani.commons.bus.earth.dto.verification.AccountVerifyDto;
import com.ani.commons.bus.earth.domain.auth.AniAuthState;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniRuleException;

public interface AccountUniAuthService {

    /**
     * <h2>Handling login form</h2>
     *
     * @param
     * @return AniAuthStateDto
     * @throws AniAuthException
     */
    public AccountSessionAuthState login(String sessionId, AccountVerifyDto accountVerifyDto) throws AniAuthException, AniRuleException;

    /**
     * <h2>Check account login state by ANITGT</h2>
     *
     * @param
     * @return Account authentication state
     * @throws AniAuthException
     */
    public AniAuthState checkIsAnonymous(String aniSessionId, String tgt, String targetUrl);


    public void logout(String sessionId, String tgt);
}

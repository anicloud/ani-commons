package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.auth.AniAccountAuthState;
import com.ani.commons.earth.domain.auth.AniAuthState;
import com.ani.commons.earth.domain.auth.SessionAuthState;
import com.ani.commons.earth.dto.verification.AccountVerifyDto;
import com.ani.commons.earth.enumeration.AuthState;
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
    public String login(String sessionId, AccountVerifyDto accountVerifyDto) throws AniAuthException, AniRuleException;

    /**
     * <h2>Check account login state by ANITGT</h2>
     *
     * @param
     * @return Account authentication state
     * @throws AniAuthException
     */

    public SessionAuthState checkIsAnonymous(String tgt,String sessionId);

    public SessionAuthState checkTgt(String tgt);

    public SessionAuthState checkSession(String aniSessionId);

    public void logout(String sessionId, String tgt);

}

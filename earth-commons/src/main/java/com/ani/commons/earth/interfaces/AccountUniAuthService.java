package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.auth.AniAccountAuthState;
import com.ani.commons.earth.domain.auth.AniAuthState;
import com.ani.commons.earth.dto.verification.AccountVerifyDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniRuleException;

import java.util.Map;

public interface AccountUniAuthService {

    /**
     * <h2>Handling login form</h2>
     * @param
     * @return AniAuthStateDto
     * @throws AniAuthException
     */
    public AniAccountAuthState login(String sessionId,AccountVerifyDto accountVerifyDto) throws AniAuthException,AniRuleException;

    /**
     * <h2>Check account login state by ANITGT</h2>
     * @param
     * @return Account authentication state
     * @throws AniAuthException
     */
    public AniAuthState checkIsAnonymous(String aniSessionId, String tgt,String targetUrl);

    public void logout(String sessionId,String tgt);
}

package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.dto.auth.AniAuthStateDto;
import com.ani.commons.earth.dto.auth.AniAccountAuthDto;
import com.ani.commons.earth.dto.verification.AccountVerifyDto;
import com.ani.utils.exception.AniAuthException;

public interface AccountUniAuthService {

    /**
     * <h2>Handling login form</h2>
     * @param
     * @return AniAuthStateDto
     * @throws AniAuthException
     */
    public AniAuthStateDto login(AccountVerifyDto accountVerifyDto) throws AniAuthException;

    /**
     * <h2>Check account login state by ANITGT</h2>
     * @param accountAuthDto
     * @return Account authentication state
     * @throws AniAuthException
     */
    public AniAuthStateDto checkSession(AniAccountAuthDto accountAuthDto) throws AniAuthException;

}

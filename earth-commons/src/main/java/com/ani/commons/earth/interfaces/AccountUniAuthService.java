package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.dto.auth.AniAccountAuthDto;
import com.ani.commons.earth.dto.auth.AniAccountLoginDto;
import com.ani.commons.earth.dto.auth.AniAppAuthDto;
import com.ani.commons.earth.dto.auth.AniAuthStateDto;
import com.ani.utils.exception.AniAuthException;

public interface AccountUniAuthService {

    /**
     * <h2>Check account login state by ANITGT cookie</h2>
     * @param accountAuthDto
     * @return Account authentication state
     * @throws AniAuthException
     */
    public AniAuthStateDto authAccount(AniAccountAuthDto accountAuthDto) throws AniAuthException;

    /**
     * <h2>Handling login form and set ANITGT cookie</h2>
     * @param accountLoginDto
     * @return TGT Cookie
     * @throws AniAuthException
     */
    public AniAuthStateDto login(AniAccountLoginDto accountLoginDto) throws AniAuthException;

    /**
     * <h2>Check app client ANITGT cookie and set ANISESSION cookie</h2>
     * @param appAuthDto
     * @return ANISESSION cookie for app
     * @throws AniAuthException
     */
    public AniAuthStateDto authApp(AniAppAuthDto appAuthDto) throws AniAuthException;

}

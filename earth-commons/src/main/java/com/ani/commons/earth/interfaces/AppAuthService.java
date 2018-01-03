package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.dto.auth.AniAppAuthDto;
import com.ani.commons.earth.dto.auth.AniAppSessionAuthDto;
import com.ani.commons.earth.dto.auth.AniAuthStateDto;

public interface AppAuthService {

    /**
     * <h2>Check ANISESSION cookie from app</h2>
     * @param appSessionAuthDto
     * @return
     */
    public AniAuthStateDto checkAppSession(AniAppSessionAuthDto appSessionAuthDto);

    /**
     * <h2>Grant ANISESSION cookie for app</h2>
     * @param appAuthDto
     * @return
     */
    public AniAuthStateDto grantAppSession(AniAppAuthDto appAuthDto);
}

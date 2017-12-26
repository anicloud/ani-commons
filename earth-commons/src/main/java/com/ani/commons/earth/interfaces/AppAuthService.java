package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.dto.AniAppAuthDto;
import com.ani.commons.earth.dto.AniAppSessionAuthDto;
import com.ani.commons.earth.dto.AniAuthStateDto;

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

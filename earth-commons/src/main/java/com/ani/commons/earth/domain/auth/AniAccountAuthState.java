package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.ContextType;
import com.ani.commons.earth.enumeration.CurUserType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-12.
 */
public class AniAccountAuthState extends AniAuthState implements Serializable {
    private static final long serialVersionUID = -2641021057324420725L;

    private String aniSessionId;

    public AniAccountAuthState() {

    }


    public String getAniSessionId() {
        return aniSessionId;
    }

    public void setAniSessionId(String aniSessionId) {
        this.aniSessionId = aniSessionId;
    }
}

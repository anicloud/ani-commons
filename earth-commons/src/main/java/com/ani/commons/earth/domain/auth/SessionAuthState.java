package com.ani.commons.earth.domain.auth;
import com.ani.commons.earth.enumeration.AuthState;

/**
 * Created by zhanglina on 18-3-23.
 */
public class SessionAuthState extends AniAuthState{
    private static final long serialVersionUID = -7221873583321917435L;
    private String aniSessionId;

    public SessionAuthState() {
    }

    public String getAniSessionId() {
        return aniSessionId;
    }

    public void setAniSessionId(String aniSessionId) {
        this.aniSessionId = aniSessionId;
    }

    public SessionAuthState(Long accountId, Long orgAccountId, Boolean isAdmin, AuthState authState, String aniSessionId) {
        super(accountId, orgAccountId, isAdmin, authState);
        this.aniSessionId = aniSessionId;
    }
}

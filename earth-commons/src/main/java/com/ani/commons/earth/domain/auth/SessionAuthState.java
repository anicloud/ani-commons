package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.ContextType;

/**
 * Created by zhanglina on 18-3-23.
 */
public class SessionAuthState extends AniAuthState {
    public SessionAuthState() {
    }

    public SessionAuthState(AuthState authState, ContextType contextType, String sessionId) {
        super(authState, contextType, sessionId);
    }
}

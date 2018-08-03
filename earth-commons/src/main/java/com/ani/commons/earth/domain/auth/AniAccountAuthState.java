package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AuthState;
/**
 * Created by zhanglina on 18-3-12.
 */
public class AniAccountAuthState extends AniAuthState{

    private static final long serialVersionUID = -2641021057324420725L;

    public AniAccountAuthState() {

    }

    public AniAccountAuthState(Long accountId, Long orgAccountId, Boolean isAdmin, AuthState authState) {
        super(accountId, orgAccountId, isAdmin, authState);
    }
}

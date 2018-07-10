package com.ani.commons.earth.domain.auth;

import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.AuthState;
import com.ani.commons.earth.enumeration.ContextType;

/**
 * Created by zhanglina on 18-3-23.
 */
public class SessionAuthState extends AniAuthState {

    private static final long serialVersionUID = -7221873583321917435L;

    private AccountType accountType;

    public SessionAuthState() {
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public SessionAuthState(AuthState authState, ContextType contextType, String aniSessionId, AccountType accountType) {
        super(authState, contextType, aniSessionId);
        this.accountType = accountType;
    }
//    public SessionAuthState(AuthState authState, ContextType contextType, String sessionId) {
//        super(authState, contextType, sessionId);
//    }
}

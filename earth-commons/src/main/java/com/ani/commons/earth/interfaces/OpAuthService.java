package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.account.AniAccount;
import com.ani.commons.earth.domain.group.AniAccountGroup;
import com.ani.commons.earth.dto.op.*;
import com.ani.commons.earth.dto.role.RoleOpDto;
import com.ani.utils.exception.AniRuleException;
import org.springframework.stereotype.Service;

/**
 * Created by changhan on 18-8-25.
 */
@Service
public interface OpAuthService {

    public AniAccountGroup checkOpByGroup(OpAuthGroupDto opAuth) throws AniRuleException;

    public AniAccount checkAccountOp(OpAuthAccountDto accountOpAuth) throws AniRuleException;

}
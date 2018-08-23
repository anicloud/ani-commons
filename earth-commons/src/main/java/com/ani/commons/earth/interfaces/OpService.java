package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.group.AniAccountGroup;
import com.ani.commons.earth.dto.op.GroupOpByPrivilegeDto;
import com.ani.commons.earth.dto.op.GroupOpDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniRuleException;

/**
 * Created by changhan on 18-8-22.
 */
public interface OpService {

    /**
     * Check operation legality by privilege of an operator in a specific group.
     * @param groupOpByPrivilegeDto
     * @return Instance of privilege group
     * @throws AniRuleException
     * @throws AniAuthException
     */
    public AniAccountGroup checkGroupOpPrivilege(GroupOpByPrivilegeDto groupOpByPrivilegeDto) throws AniRuleException, AniAuthException;

}
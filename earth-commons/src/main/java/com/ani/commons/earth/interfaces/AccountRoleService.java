package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.role.AccountRole;
import com.ani.commons.earth.dto.organization.role.AccountRoleDto;
import com.ani.commons.earth.dto.organization.role.AccountRoleQueryDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

/**
 * Created by ebrx on 18-7-26.
 */
public interface AccountRoleService {

    /**
     * <H2>Add Role</H2>
     * @param accountRoleDto
     */
    public void addRole(Long opAccountId,AccountRoleDto accountRoleDto) throws AniRuleException, AniAuthException;

    /**
     * <H2>Check ownerId delete role by id. </H2>
     * @param opAccountId,roleId
     */
    public void removeRole(Long opAccountId,Long ownerId,Long roleId) throws AniRuleException, AniAuthException;
    /**
     * <H2>Update role.</H2>
     * @param accountRoleDto
     */
    public void updateRole(Long opAccountId,AccountRoleDto accountRoleDto) throws AniRuleException, AniAuthException;

    /**
     * <H2>Query accountRole.</H2>
     * @param opAccountId roleId
     * @return
     */
    public AccountRole getAccountRole(Long opAccountId,Long ownerId,Long roleId) throws AniRuleException, AniAuthException;

    /**
     * <H2>Query accountRole list.</H2>
     * @return opAccountId
     */
    public List<AccountRole> getAccountRoleList(Long opAccountId,Long ownerId) throws AniRuleException, AniAuthException;


}

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
    public void addRole(AccountRoleDto accountRoleDto) throws AniRuleException, AniAuthException;

    /**
     * <H2>Check ownerId delete role by id. </H2>
     * @param accountRoleDto
     */
    public void removeRole(AccountRoleDto accountRoleDto) throws AniRuleException, AniAuthException;
    /**
     * <H2>Update role.</H2>
     * @param accountRoleDto
     */
    public void updateRole(AccountRoleDto accountRoleDto) throws AniRuleException, AniAuthException;

    /**
     * <H2>Query accountRole.</H2>
     * @param accountRoleDto
     * @return
     */
    public AccountRole getAccountRole(AccountRoleDto accountRoleDto) throws AniRuleException, AniAuthException;

    /**
     * <H2>Query accountRole list.</H2>
     * @return opAccountId
     */
    public List<AccountRole> getAccountRoleList(AccountRoleDto accountRoleDto) throws AniRuleException, AniAuthException;


}

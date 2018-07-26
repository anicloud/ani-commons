package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.role.AccountRole;
import com.ani.commons.earth.dto.organization.role.AccountRoleDto;
import com.ani.commons.earth.dto.organization.role.AccountRoleQueryDto;

import java.util.List;

/**
 * Created by ebrx on 18-7-26.
 */
public interface AccountRoleService {

    /**
     * <H2>Add Role</H2>
     * @param accountRoleDto
     */
    public void addRole(AccountRoleDto accountRoleDto);

    /**
     * <H2>Check ownerId delete role by id. </H2>
     * @param accountRoleQueryDto
     */
    public void removeRole(AccountRoleQueryDto accountRoleQueryDto);

    /**
     * <H2>Update role.</H2>
     * @param accountRoleDto
     */
    public void updateRole(AccountRoleDto accountRoleDto);

    /**
     * <H2>Query accountRole.</H2>
     * @param id
     * @return
     */
    public AccountRole getAccountRole(AccountRoleQueryDto accountRoleQueryDto);

    /**
     * <H2>Query accountRole list.</H2>
     * @return
     */
    public List<AccountRole> getAccountRoleList(AccountRoleQueryDto accountRoleQueryDto);


}

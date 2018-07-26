package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.role.AccountRole;
import com.ani.commons.earth.dto.organization.role.OrgRoleDto;

/**
 * Created by ebrx on 18-7-26.
 */
public interface AccountRoleService {

    /**
     * <H2>Add Role</H2>
     * @param orgRoleDto
     */
    public void addRole(OrgRoleDto orgRoleDto);

    /**
     * <H2>Check ownerId delete role by id. </H2>
     * @param id
     * @param ownerId
     */
    public void removeRole(Long id,Long ownerId);

    /**
     * <H2>Update role.</H2>
     * @param orgRoleDto
     */
    public void updateRole(OrgRoleDto orgRoleDto);

    /**
     * <H2>Query accountRole.</H2>
     * @param id
     * @return
     */
    public AccountRole getAccountRole(Long id);


}

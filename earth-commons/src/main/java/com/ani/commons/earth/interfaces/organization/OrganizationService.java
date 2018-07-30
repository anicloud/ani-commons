package com.ani.commons.earth.interfaces.organization;

import com.ani.commons.earth.domain.account.organization.OrgAccountRole;
import com.ani.commons.earth.domain.organization.employee.OrgMember;
import com.ani.commons.earth.dto.organization.org.OrgMemberInfoDto;

import com.ani.commons.earth.dto.organization.role.OrgAccountRoleDto;
import com.ani.commons.earth.dto.organization.role.OrgRoleOperationDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

/*
 * Created by zhanglina on 18-4-26.
 */
public interface OrganizationService {



    public List<OrgAccountRole> getRolesByOrgId(Integer orgId) throws AniRuleException;

    public List<OrgAccountRole> updateOrgRoles(OrgAccountRoleDto orgRole)throws AniRuleException,AniDataException;

    public OrgAccountRole addOrgRole(OrgAccountRoleDto orgRole)throws AniRuleException,AniDataException;

    public void addMemberToOrg(OrgMemberInfoDto orgMemberInfoDto);

    public List<OrgAccountRole> removeOrgRole(OrgRoleOperationDto orgRoleOperation) throws AniAuthException,AniRuleException;

    public Long getEmployeeId(Integer orgId,Long accountId);

    public void removeOrg(Long accountId,Integer orgId);

    public OrgAccountRole getOrgRole(OrgRoleOperationDto roleOperationDto);

    public OrgMember getOrgMemberByEmployeeId(Long employeeId);

}

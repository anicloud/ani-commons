package com.ani.commons.earth.interfaces.organization;

import com.ani.commons.earth.domain.organization.Organization;
import com.ani.commons.earth.domain.organization.account.OrgAccountRole;
import com.ani.commons.earth.dto.organization.org.OrgMemberInfoDto;
import com.ani.commons.earth.dto.organization.org.OrgRegisterDto;
import com.ani.commons.earth.dto.organization.org.OrgUpdateDto;
import com.ani.commons.earth.dto.organization.role.OrgAccountRoleDto;
import com.ani.commons.earth.dto.organization.role.OrgRoleOperationDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

/**
 * Created by zhanglina on 18-4-26.
 */
public interface OrganizationService {

    public Organization addOrg(OrgRegisterDto orgRegister) throws AniRuleException;

    public Organization updateOrg(OrgUpdateDto orgUpdateDto) throws AniAuthException,AniRuleException;

    public List<Organization> getOrgByAccount(Long accountId) throws AniRuleException;

    public List<OrgAccountRole> getRolesByOrgId(Long orgId) throws AniRuleException;

    public List<OrgAccountRole> updateOrgRoles(OrgAccountRoleDto orgRole)throws AniRuleException,AniDataException;

    public OrgAccountRole addOrgRole(OrgAccountRoleDto orgRole)throws AniRuleException,AniDataException;

    public void addMemberToOrg(OrgMemberInfoDto orgMemberInfoDto);

    public List<Long> getMembersByOrgId(Long opEmployeeId,Long orgId);

    public List<OrgAccountRole> removeOrgRole(OrgRoleOperationDto orgRoleOperation) throws AniAuthException,AniRuleException;

    public Long getEmployeeId(Long orgId,Long accountId);

    public void removeOrg(Long accountId,Long orgId);

    public OrgAccountRole getOrgRole(OrgRoleOperationDto roleOperationDto);

}

package com.ani.commons.earth.interfaces.organization;

import com.ani.commons.earth.domain.account.organization.OrgMemberInfo;
import com.ani.commons.earth.domain.organization.node.OTNode;
import com.ani.commons.earth.domain.organization.OTNodeMember;
import com.ani.commons.earth.domain.organization.employee.OrgMember;
import com.ani.commons.earth.dto.organization.node.*;
import com.ani.commons.earth.dto.organization.org.OrgResourceAccessDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;
import java.util.Set;

/**
 * Created by zhanglina on 18-4-26.
 * Last Modified by xuben on 18-7-26.
 */
public interface OTNodeService {

    public OTNodeBasicDto addNode(OTNodeAddDto otNodeAddDto, Long opEmployeeId) throws AniAuthException,AniRuleException;

    public Long removeNode(OTNodeOpDto otNodeOpDto) throws AniAuthException,AniRuleException;

    public void addNodeMember(OTNodeMemberInfoDto otNodeMemberAddDto)throws AniAuthException,AniRuleException,AniDataException;

    public Set<OTNodeBasicDto> getNodeChildren(OTNodeOpDto otNodeOpDto) throws AniAuthException;

    public List<OTNodeMember> getNodeMembers(OTNodeOpDto otNodeOpDto) throws AniAuthException;

    public void removeMember(OTNodeMemberOpDto removeDto,boolean isAll) throws AniAuthException;

    public void updateMemberRole(OTNodeMemberDto otNodeMemberDto) throws AniAuthException;

    public void updateMemberInfo(OTNodeMemberInfoDto otNodeMemberInfoDto) throws AniAuthException,AniDataException;

    public void updateNodeTopology(OTNodeUpdateTopologyDto otNodeUpdateDto) throws AniAuthException;

    public OTNodeBasicDto updateNodeName(OTNodeInfoDto otNodeInfoDto) throws AniAuthException;

    public OTNode getTreeByEmployeeId(Long employeeId) throws AniAuthException;

    public OTNodeBasicDto getNodeDetail(Long nodeId);

    public OrgMember getNodeMemberByEmployeeId(OTNodeOpDto otNodeOpDto, Long employeeId) throws  AniAuthException,AniDataException;

    public void updateEmployeeState(EmployeeStateUpdateDto employeeStateUpdateDto) throws AniAuthException;

    public List<OrgMemberInfo> getMemberByNameAlp(String nameAlp, Integer orgId,Long nodeId);

    public void addOrgMemberToNode(OTNodeOpDto otNodeOpDto,List<NodeAddMemberDto> nodeAddMemberDtos) throws AniDataException;

    public void checkHaveRootPrivilege(Long opAccountId, Integer orgId) throws AniAuthException;

    public void checkOrgNodeResourceAccessibility(OrgNodeAccessibilityDto orgResourceAccessDto) throws AniRuleException;

    public void checkOrgResourceAccess(OrgResourceAccessDto orgResourceAccessDto) throws AniRuleException;

}

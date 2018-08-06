package com.ani.commons.earth.interfaces.organization;

import com.ani.commons.earth.domain.organization.node.OTNode;
import com.ani.commons.earth.dto.organization.node.*;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniRuleException;

import java.util.Set;

/**
 * Created by zhanglina on 18-4-26.
 * Last Modified by xuben on 18-8-6.
 */
public interface OTNodeService {

    public OTNodeBasicDto addNode(OTNodeInfoDto otNodeInfoDto, Long opAccountId) throws AniAuthException, AniRuleException;

    public void removeNode(Long nodeId, Long parentNodeId, Long opAccountId) throws AniAuthException, AniRuleException;

    public void updateNodeInfo(OTNodeInfoDto otNodeInfoDto, Long opAccountId) throws AniAuthException;

    public void updateNodeTopology(OTNodeUpdateTopologyDto otNodeUpdateDto, Long opAccountId) throws AniAuthException, AniRuleException;

    public OTNode getNodeDetail(Long nodeId, Long opAccountId) throws AniRuleException;

    public Set<Long> getDescendantNodes(Long nodeId, Long opAccountId) throws AniRuleException;


//    public OTNode getTreeByEmployeeId(Long accountId) throws AniAuthException;

//    public void addNodeMember(OTNodeMemberInfoDto otNodeMemberAddDto)throws AniAuthException,AniRuleException,AniDataException;
//
//    public Set<OTNodeBasicDto> getNodeChildren(OTNodeOpDto otNodeOpDto) throws AniAuthException;
//
//    public List<OTNodeMember> getNodeMembers(OTNodeOpDto otNodeOpDto) throws AniAuthException;
//
//    public void removeMember(OTNodeMemberOpDto removeDto,boolean isAll) throws AniAuthException;
//
//    public void updateMemberRole(OTNodeMemberDto otNodeMemberDto) throws AniAuthException;
//
//    public void updateMemberInfo(OTNodeMemberInfoDto otNodeMemberInfoDto) throws AniAuthException,AniDataException;
//
//   public OrgMember getNodeMemberByEmployeeId(OTNodeOpDto otNodeOpDto, Long employeeId) throws  AniAuthException,AniDataException;
//
//    public void updateEmployeeState(EmployeeStateUpdateDto employeeStateUpdateDto) throws AniAuthException;
//
//    public List<OrgMemberInfo> getMemberByNameAlp(String nameAlp, Integer orgId,Long nodeId);
//
//    public void addOrgMemberToNode(OTNodeOpDto otNodeOpDto,List<NodeAddMemberDto> nodeAddMemberDtos) throws AniDataException;
//
//    public void checkHaveRootPrivilege(Long opAccountId, Integer orgId) throws AniAuthException;
//
//    public void checkOrgNodeResourceAccessibility(OrgNodeAccessibilityDto orgResourceAccessDto) throws AniRuleException;
//
//    public void checkOrgResourceAccess(OrgResourceAccessDto orgResourceAccessDto) throws AniRuleException;

}

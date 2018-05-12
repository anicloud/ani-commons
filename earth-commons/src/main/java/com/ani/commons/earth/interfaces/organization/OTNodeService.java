package com.ani.commons.earth.interfaces.organization;

import com.ani.commons.earth.domain.organization.account.OrgMemberInfo;
import com.ani.commons.earth.domain.organization.tree.OTNodeDetail;
import com.ani.commons.earth.domain.organization.tree.OTNode;
import com.ani.commons.earth.domain.organization.tree.OTNodeMember;
import com.ani.commons.earth.domain.organization.tree.OrgMember;
import com.ani.commons.bus.earth.dto.organization.node.*;
import com.ani.commons.earth.dto.organization.node.*;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;
import java.util.Set;

/**
 * Created by zhanglina on 18-4-26.
 */
public interface OTNodeService {

    public OTNodeDetail addNode(OTNodeAddDto otNodeDto) throws AniAuthException,AniRuleException;

    public Long removeNode(OTNodeOpDto otNodeOpDto) throws AniAuthException,AniRuleException;

    public void addNodeMember(OTNodeMemberInfoDto otNodeMemberAddDto)throws AniAuthException,AniRuleException;

    public Set<OTNodeDetail> getNodeChildren(OTNodeOpDto otNodeOpDto) throws AniAuthException;

    public List<OTNodeMember> getNodeMembers(OTNodeOpDto otNodeOpDto) throws AniAuthException;

    public void removeMember(OTNodeMemberOpDto removeDto) throws AniAuthException;

    public void updateMemberRole(OTNodeMemberDto otNodeMemberDto) throws AniAuthException;

    public void updateMemberInfo(OTNodeMemberInfoDto otNodeMemberInfoDto) throws AniAuthException;

    public void updateNodeTopology(OTNodeUpdateTopologyDto otNodeUpdateDto) throws AniAuthException;

    public OTNodeDetail updateNodeName(OTNodeInfoDto otNodeInfoDto) throws AniAuthException;

    public OTNode getTreeByEmployeeId(Long employeeId) throws AniAuthException;

    public OTNodeDetail getNodeDetail(Long nodeId);

    public OrgMember getNodeMemberByEmployeeId(OTNodeOpDto otNodeOpDto, Long employeeId) throws  AniAuthException;

    public void updateEmployeeState(EmployeeStateUpdateDto employeeStateUpdateDto) throws AniAuthException;

    public List<OrgMemberInfo> getMemberByNameAlp(String nameAlp, Long orgId,Long nodeId);

    public void addOrgMemberToNode(OTNodeOpDto otNodeOpDto,List<NodeAddMemberDto> nodeAddMemberDtos);

}

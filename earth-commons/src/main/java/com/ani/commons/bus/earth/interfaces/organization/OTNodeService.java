package com.ani.commons.bus.earth.interfaces.organization;

import com.ani.commons.bus.earth.domain.organization.tree.OTNodeDetail;
import com.ani.commons.bus.earth.domain.organization.tree.OTNode;
import com.ani.commons.bus.earth.domain.organization.tree.OTNodeMember;
import com.ani.commons.bus.earth.dto.organization.node.*;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;
import java.util.Set;

/**
 * Created by zhanglina on 18-4-26.
 */
public interface OTNodeService {

    public OTNodeDetail addNode(OTNodeAddDto otNodeDto) throws AniAuthException,AniRuleException;

    public void removeNode(OTNodeOpDto otNodeOpDto) throws AniAuthException,AniRuleException;

    public OTNodeDetail addNodeMember(OTNodeMemberOpDto memberOpDto) throws AniAuthException,AniRuleException;

    public Set<OTNodeDetail> getNodeChildren(OTNodeOpDto otNodeOpDto) throws AniAuthException;

    public List<OTNodeMember> getNodeMembers(OTNodeOpDto otNodeOpDto) throws AniAuthException;

    public void removeMembers(OTNodeMemberOpDto removeDto) throws AniAuthException;

    public void updateMemberRole(OTNodeMemberDto otNodeMemberDto) throws AniAuthException;

    public void updateNodeTopology(OTNodeUpdateTopologyDto otNodeUpdateDto) throws AniAuthException;

    public OTNodeDetail updateNodeName(OTNodeInfoDto otNodeInfoDto) throws AniAuthException;

    public OTNode getTreeByEmployeeId(Long employeeId) throws AniAuthException;

    public OTNodeDetail getNodeDetail(Long nodeId);

}

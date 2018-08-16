package com.ani.commons.earth.interfaces.organization;

import com.ani.commons.earth.domain.organization.node.OTNode;
import com.ani.commons.earth.dto.organization.node.*;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniRuleException;

import java.util.Set;

/**
 * Created by zhanglina on 18-4-26.
 * Last Modified by xuben on 18-8-10.
 */
public interface OTNodeService {

    public OTNodeBasicDto addNode(OTNodeInfoUpdateDto otNodeInfoUpdateDto, Long opAccountId) throws AniAuthException, AniRuleException;

    public void removeNode(Long nodeId, Long parentNodeId, Long opAccountId) throws AniAuthException, AniRuleException;

    public void updateNodeInfo(OTNodeInfoUpdateDto otNodeInfoDto, Long opAccountId) throws AniAuthException, AniRuleException;

    public void updateNodeTopology(OTNodeUpdateTopologyDto otNodeUpdateDto, Long opAccountId) throws AniAuthException, AniRuleException;

    public OTNode getNodeDetail(Long nodeId, Long opAccountId,Long orgAccountId) throws AniRuleException, AniAuthException;

    public Set<Long> getDescendantNodes(Long nodeId, Long opAccountId,Long orgAccountId) throws AniRuleException, AniAuthException;

    public Set<OTNodeBasicDto> getNodeChildren(Long nodeId, Long opAccountId,Long orgAccountId) throws AniAuthException, AniRuleException;

    public OTNodeDetailDto getATreeByRootNodeId(Long nodeId, Long opAccountId) throws AniRuleException, AniAuthException;

}

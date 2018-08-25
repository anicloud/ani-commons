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

    public OTNodeBasicDto addNode(OTNodeInfoDto otNodeInfoDto) throws AniAuthException, AniRuleException;

    public void removeNode(OTNodeAdminOpDto otNodeAdminOpDto) throws AniAuthException, AniRuleException;

    public void updateNodeInfo(OTNodeInfoDto otNodeInfoDto) throws AniAuthException, AniRuleException;

    // public void updateNodeTopology(OTNodeUpdateTopologyDto otNodeUpdateDto) throws AniAuthException, AniRuleException;

    public OTNode getNodeDetail(OTNodeAdminOpDto otNodeAdminOpDto) throws AniRuleException, AniAuthException;

    public Set<Long> getDescendantNodes(OTNodeAdminOpDto otNodeAdminOpDto) throws AniRuleException, AniAuthException;

    public Set<OTNodeBasicDto> getChildrenNodes(OTNodeAdminOpDto otNodeAdminOpDto) throws AniAuthException, AniRuleException;

    public OTNodeDetailDto getATreeByRootNodeId(OTNodeAdminOpDto otNodeAdminOpDto) throws AniRuleException, AniAuthException;

}

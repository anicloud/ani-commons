package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.util.List;
import java.util.Set;

/**
 * Created by zhanglina on 18-5-23.
 */
public class OrgNodeModelMappingDto extends OrgModelOpDto {

    private static final long serialVersionUID = -54754385669249172L;

    @AniRequiredField
    private Set<Long> modelsId;
    @AniRequiredField
    private Long nodeId;

    public OrgNodeModelMappingDto() {
    }

    public OrgNodeModelMappingDto(Integer orgId, Long opAccountId, Set<Long> modelsId, Long nodeId) {
        super(orgId, opAccountId);
        this.modelsId = modelsId;
        this.nodeId = nodeId;
    }

    public Set<Long> getModelsId() {
        return modelsId;
    }

    public void setModelsId(Set<Long> modelsId) {
        this.modelsId = modelsId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }
}

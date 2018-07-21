package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.utils.dto.AniRequiredField;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-5-23.
 */
public class OrgModelRegDto extends OrgModelOpDto {

    private static final long serialVersionUID = -1551118554802685820L;
    @AniRequiredField
    private List<Long> modelId;

    public OrgModelRegDto() {
    }

    public OrgModelRegDto(Integer orgId, Long opAccountId, List<Long> modelId) {
        super(orgId, opAccountId);
        this.modelId = modelId;
    }

    public List<Long> getModelId() {
        return modelId;
    }

    public void setModelId(List<Long> modelId) {
        this.modelId = modelId;
    }
}

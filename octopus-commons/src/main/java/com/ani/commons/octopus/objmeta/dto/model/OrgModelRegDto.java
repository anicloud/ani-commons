package com.ani.commons.octopus.objmeta.dto.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-5-23.
 */
public class OrgModelRegDto extends OrgModelOpDto {

    private static final long serialVersionUID = -1551118554802685820L;

    private List<Long> modelId;

    public OrgModelRegDto() {
    }

    public List<Long> getModelId() {
        return modelId;
    }

    public void setModelId(List<Long> modelId) {
        this.modelId = modelId;
    }
}

package com.ani.commons.octopus.servicemeta.dto.service;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-31.
 */
public class AniServiceOpDto implements Serializable {

    private static final long serialVersionUID = -7384865561424191204L;
    private Long opAccountId;
    private Long modelId;


    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }


}

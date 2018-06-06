package com.ani.commons.octopus.servicemeta.dto.service;


import com.ani.commons.octopus.objmeta.dto.model.ModelQueryDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-1.
 */
public class ServiceStateUpdateDto implements Serializable{

    private static final long serialVersionUID = 3455725211676011250L;

    private ModelQueryDto modelQueryDto;
    private Boolean forbid;

    public ModelQueryDto getModelQueryDto() {
        return modelQueryDto;
    }

    public void setModelQueryDto(ModelQueryDto modelQueryDto) {
        this.modelQueryDto = modelQueryDto;
    }

    public Boolean getForbid() {
        return forbid;
    }

    public void setForbid(Boolean forbid) {
        this.forbid = forbid;
    }
}

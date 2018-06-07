package com.ani.commons.octopus.servicemeta.dto.service;


import com.ani.commons.octopus.objmeta.dto.model.ModelQueryDto;
import com.ani.utils.core.DataState;
import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-1.
 */
public class ServiceStateUpdateDto extends AniDto {

    private static final long serialVersionUID = 3455725211676011250L;

    private ModelQueryDto modelQueryDto;
    private DataState forbid;

    public ModelQueryDto getModelQueryDto() {
        return modelQueryDto;
    }

    public void setModelQueryDto(ModelQueryDto modelQueryDto) {
        this.modelQueryDto = modelQueryDto;
    }

    public DataState getForbid() {
        return forbid;
    }

    public void setForbid(DataState forbid) {
        this.forbid = forbid;
    }
}

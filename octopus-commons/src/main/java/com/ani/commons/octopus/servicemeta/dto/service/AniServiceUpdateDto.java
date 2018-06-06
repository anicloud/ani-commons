package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelUpdateDto;

/**
 * Created by zhanglina on 18-6-5.
 */
public class AniServiceUpdateDto extends AniServiceDto {
    private static final long serialVersionUID = -1887695056574931466L;
    private ModelUpdateDto modelUpdateDto;

    public ModelUpdateDto getModelUpdateDto() {
        return modelUpdateDto;
    }

    public void setModelUpdateDto(ModelUpdateDto modelUpdateDto) {
        this.modelUpdateDto = modelUpdateDto;
    }
}

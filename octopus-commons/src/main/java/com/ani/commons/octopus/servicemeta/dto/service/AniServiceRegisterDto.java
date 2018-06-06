package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelRegisterDto;
import com.ani.commons.octopus.servicemeta.domain.service.AniService;

/**
 * Created by zhanglina on 18-6-5.
 */
public class AniServiceRegisterDto extends AniServiceDto{

    private static final long serialVersionUID = 7816221974063283879L;

    protected ModelRegisterDto modelRegisterDto;

    public ModelRegisterDto getModelRegisterDto() {
        return modelRegisterDto;
    }

    public void setModelRegisterDto(ModelRegisterDto modelRegisterDto) {
        this.modelRegisterDto = modelRegisterDto;
    }
}

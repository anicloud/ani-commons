package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelBriefInfoDto;
import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-1.
 */
public class ServiceBriefInfoDto implements Serializable {

    private static final long serialVersionUID = -7926819973737697307L;

    private ModelBriefInfoDto modelBriefInfoDto;

    private String loginUrl;

    public ModelBriefInfoDto getModelBriefInfoDto() {
        return modelBriefInfoDto;
    }

    public void setModelBriefInfoDto(ModelBriefInfoDto modelBriefInfoDto) {
        this.modelBriefInfoDto = modelBriefInfoDto;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public ServiceBriefInfoDto() {
    }

    public ServiceBriefInfoDto(ModelBriefInfoDto modelBriefInfoDto, String loginUrl) {
        this.modelBriefInfoDto = modelBriefInfoDto;
        this.loginUrl = loginUrl;
    }
}

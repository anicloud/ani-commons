package com.ani.commons.octopus.servicemeta.dto.service;

/**
 * Created by zhanglina on 18-7-18.
 */
public class AniOrgServiceRegDto extends AniServiceRegisterDto {

    private static final long serialVersionUID = -89897077327564947L;

    private Integer orgId;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}

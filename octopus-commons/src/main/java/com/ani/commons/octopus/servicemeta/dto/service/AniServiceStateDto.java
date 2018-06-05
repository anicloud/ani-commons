package com.ani.commons.octopus.servicemeta.dto.service;


import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-1.
 */
public class AniServiceStateDto implements Serializable{

    private static final long serialVersionUID = 3455725211676011250L;

    private AniServiceOpDto serviceOpDto;
    private Boolean forbid;

    public AniServiceOpDto getServiceOpDto() {
        return serviceOpDto;
    }

    public void setServiceOpDto(AniServiceOpDto serviceOpDto) {
        this.serviceOpDto = serviceOpDto;
    }

    public Boolean getForbid() {
        return forbid;
    }

    public void setForbid(Boolean forbid) {
        this.forbid = forbid;
    }
}

package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.dto.object.ObjectModelRegisterDto;
import com.ani.commons.octopus.servicemeta.dto.account.AccountOpDto;
import com.ani.commons.octopus.servicemeta.enumeration.Transparency;
import com.ani.commons.octopus.servicemeta.enumeration.TwoCertification;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-22.
 */
public class AniServiceDto implements Serializable {

    private static final long serialVersionUID = 2297358921824654904L;
    protected ObjectModelRegisterDto objectModelRegisterDto;
    protected String desc;
    protected String detail;
    protected String logoFileType;
    protected Transparency transparency;
    protected String serviceType;
    protected TwoCertification twoCertification;//dual
    private AccountOpDto accountOpDto;
    //private AniServiceOpDto accountOpDto;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLogoFileType() {
        return logoFileType;
    }

    public void setLogoFileType(String logoFileType) {
        this.logoFileType = logoFileType;
    }

    public Transparency getTransparency() {
        return transparency;
    }

    public void setTransparency(Transparency transparency) {
        this.transparency = transparency;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public TwoCertification getTwoCertification() {
        return twoCertification;
    }

    public void setTwoCertification(TwoCertification twoCertification) {
        this.twoCertification = twoCertification;
    }

    public AniServiceOpDto getAccountOpDto() {
        return accountOpDto;
    }

    public void setAccountOpDto(AniServiceOpDto accountOpDto) {
        this.accountOpDto = accountOpDto;
    }
}

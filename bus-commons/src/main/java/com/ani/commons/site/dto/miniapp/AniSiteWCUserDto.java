package com.ani.commons.site.dto.miniapp;

import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-9.
 */
public class AniSiteWCUserDto extends AniDto implements Serializable {
    private static final long serialVersionUID = -1040031800665960198L;
    private String rawData;
    private String signature;
    private String encryptedData;
    private String vi;
    private AniWCUserInfoDto wcUserInfo;
    public AniSiteWCUserDto() {
    }

    public AniSiteWCUserDto(String rawData, String signature, String encryptedData, String vi, AniWCUserInfoDto wcUserInfo) {
        this.rawData = rawData;
        this.signature = signature;
        this.encryptedData = encryptedData;
        this.vi = vi;
        this.wcUserInfo = wcUserInfo;
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public AniWCUserInfoDto getWcUserInfo() {
        return wcUserInfo;
    }

    public void setWcUserInfo(AniWCUserInfoDto wcUserInfo) {
        this.wcUserInfo = wcUserInfo;
    }
}

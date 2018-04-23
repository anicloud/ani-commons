package com.ani.commons.bus.site.dto.miniapp;

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
    private String iv;
    private AniWCUserInfoDto wcUserInfo;
    public AniSiteWCUserDto() {
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

    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }

//    public AniWCUserInfoDto getWcUserInfo() {
//        return wcUserInfo;
//    }
//
//    public void setWcUserInfo(AniWCUserInfoDto wcUserInfo) {
//        this.wcUserInfo = wcUserInfo;
//    }
}

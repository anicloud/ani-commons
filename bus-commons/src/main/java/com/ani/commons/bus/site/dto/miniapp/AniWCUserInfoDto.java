package com.ani.commons.bus.site.dto.miniapp;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-10.
 */
public class AniWCUserInfoDto implements Serializable {
    private static final long serialVersionUID = 7085146922509462874L;
    private String nickName;
    private String avatarUrl;
    private String gender;
    private String city;
    private String province;
    private String country;

    public AniWCUserInfoDto() {
    }

    public AniWCUserInfoDto(String nickName, String avatarUrl, String gender, String city, String province, String country) {
        this.nickName = nickName;
        this.avatarUrl = avatarUrl;
        this.gender = gender;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

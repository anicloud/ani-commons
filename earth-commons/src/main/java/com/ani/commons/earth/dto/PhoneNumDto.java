package com.ani.commons.earth.dto;

/**
 * Created by zhanglina on 17-12-27.
 */
public class PhoneNumDto extends RegistrationDto{

    short regionNum;
    String phoneNum;

    public PhoneNumDto() {
    }

    public PhoneNumDto(short regionNum, String phoneNum) {
        this.regionNum = regionNum;
        this.phoneNum = phoneNum;
    }

    public short getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(short regionNum) {
        this.regionNum = regionNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String getCacheKey(String prefix) {
        return String.format(
                "%s:%s:%d:%s"
                , prefix
                , "phoneverf"
                , regionNum
                , phoneNum);
    }
}

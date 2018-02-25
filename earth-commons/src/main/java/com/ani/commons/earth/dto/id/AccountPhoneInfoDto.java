package com.ani.commons.earth.dto.id;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AccountPhoneInfoDto extends AccountIdInfoDto {

    short regionNum;
    String phoneNum;

    public AccountPhoneInfoDto() {
    }

    public AccountPhoneInfoDto(short regionNum, String phoneNum) {
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

}

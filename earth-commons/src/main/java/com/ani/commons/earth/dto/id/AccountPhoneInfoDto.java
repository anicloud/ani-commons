package com.ani.commons.earth.dto.id;

import com.ani.utils.dto.AniFieldFormat;
import com.ani.utils.dto.AniPattern;
import com.ani.utils.dto.AniRequiredField;

import java.io.Serializable;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AccountPhoneInfoDto extends AccountIdInfoDto implements Serializable {

    private static final long serialVersionUID = -7964278395547774683L;
    @AniRequiredField
    String regionNum;

    @AniRequiredField
    @AniFieldFormat(pattern = AniPattern.PHONE_PATTERN)
    String phoneNum;

    public AccountPhoneInfoDto() {
    }

    public String getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(String regionNum) {
        this.regionNum = regionNum;
    }

    public AccountPhoneInfoDto(String regionNum, String phoneNum) {

        this.regionNum = regionNum;
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhone(){
        return regionNum+"-"+phoneNum;
    }

}

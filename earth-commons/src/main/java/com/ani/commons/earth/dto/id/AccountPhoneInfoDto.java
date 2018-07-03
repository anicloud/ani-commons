package com.ani.commons.earth.dto.id;

import com.ani.utils.dto.AniFieldFormat;
import com.ani.utils.dto.AniPattern;
import com.ani.utils.dto.AniRequiredField;
import org.springframework.util.StringUtils;

import java.io.Serializable;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AccountPhoneInfoDto extends AccountIdInfoDto {

    private static final long serialVersionUID = -7964278395547774683L;
    @AniRequiredField
    Short regionNum;

    @AniRequiredField
    @AniFieldFormat(pattern = AniPattern.PHONE_PATTERN)
    String phoneNum;

    public AccountPhoneInfoDto() {
    }

    public Short getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(Short regionNum) {
        this.regionNum = regionNum;
    }

    public AccountPhoneInfoDto(Short regionNum, String phoneNum) {
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
    public boolean isNotNull(){
        boolean isLegal=false;
        if (regionNum!=null && !StringUtils.isEmpty(phoneNum)){
            isLegal=true;
        }
        return isLegal;
    }

}

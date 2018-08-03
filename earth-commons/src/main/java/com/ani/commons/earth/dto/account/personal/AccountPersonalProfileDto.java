package com.ani.commons.earth.dto.account.personal;

import com.ani.commons.earth.dto.account.AccountProfileDto;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.Sex;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-4.
 */
public class AccountPersonalProfileDto extends AccountProfileDto implements Serializable{

    private static final long serialVersionUID = -5249094104799316067L;

    private String region;
    private String province;
    private String city;
    private String name;
    private Sex sex;

    public AccountPersonalProfileDto(Long accountId, String name, String password, String userName, AccountType accountType, String region, String province, String city, String name1, Sex sex) {
        super(accountId, name, password, userName, accountType);
        this.region = region;
        this.province = province;
        this.city = city;
        this.name = name1;
        this.sex = sex;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public AccountPersonalProfileDto() {
        this.accountType = AccountType.PERSONAL;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}

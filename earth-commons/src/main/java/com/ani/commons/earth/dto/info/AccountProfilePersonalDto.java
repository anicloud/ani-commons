package com.ani.commons.earth.dto.info;

import com.ani.commons.earth.enumeration.AccountType;

/**
 * Created by zhanglina on 18-3-4.
 */
public class AccountProfilePersonalDto extends AccountProfileDto {

    String sex;

    @Override
    public AccountType getAccountType() {
        return AccountType.PERSONAL;
    }

    public AccountProfilePersonalDto() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

package com.ani.commons.earth.dto.info;

import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.Sex;

/**
 * Created by zhanglina on 18-3-4.
 */
public class AccountProfilePersonalDto extends AccountProfileDto {

    Sex sex;

    @Override
    public AccountType getAccountType() {
        return AccountType.PERSONAL;
    }

    public AccountProfilePersonalDto() {
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}

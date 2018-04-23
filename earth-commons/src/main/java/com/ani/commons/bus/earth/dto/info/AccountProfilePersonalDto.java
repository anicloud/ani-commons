package com.ani.commons.bus.earth.dto.info;

import com.ani.commons.bus.earth.enumeration.AccountType;
import com.ani.commons.bus.earth.enumeration.Sex;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-4.
 */
public class AccountProfilePersonalDto extends AccountProfileDto implements Serializable{

    private static final long serialVersionUID = -5249094104799316067L;
    Sex sex;

    public AccountProfilePersonalDto() {
        this.accountType = AccountType.PERSONAL;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}

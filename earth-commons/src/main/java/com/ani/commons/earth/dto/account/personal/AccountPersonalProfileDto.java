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
    Sex sex;

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

package com.ani.commons.earth.dto.info;

import com.ani.commons.earth.enumeration.AccountType;

/**
 * Created by zhanglina on 18-3-4.
 */
public class AccountProfileOrgDto extends AccountProfileDto{

    String desc;

    @Override
    public AccountType getAccountType() {
        return AccountType.ORGANIZATION;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

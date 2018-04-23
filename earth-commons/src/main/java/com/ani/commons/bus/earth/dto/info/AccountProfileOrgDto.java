package com.ani.commons.bus.earth.dto.info;

import com.ani.commons.bus.earth.enumeration.AccountType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-4.
 */
public class AccountProfileOrgDto extends AccountProfileDto implements Serializable{

    private static final long serialVersionUID = 6321585632641903271L;
    String desc;

    public AccountProfileOrgDto() {
        this.accountType = AccountType.ORGANIZATION;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

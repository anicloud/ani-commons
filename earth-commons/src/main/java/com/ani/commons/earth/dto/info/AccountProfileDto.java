package com.ani.commons.earth.dto.info;

import com.ani.commons.earth.domain.id.Phone;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.dto.AniDto;

public class AccountProfileDto extends AniDto {

    Long accountId;

    String name;

    String sex;

    public AccountProfileDto() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

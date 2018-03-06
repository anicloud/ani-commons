package com.ani.commons.earth.dto.info;

import com.ani.commons.earth.domain.id.Phone;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.dto.AniDto;

public abstract class AccountProfileDto extends AniDto {

    Long accountId;

    String name;

    Long portraitId;

    public Long getPortraitId() {
        return portraitId;
    }

    public void setPortraitId(Long portraitId) {
        this.portraitId = portraitId;
    }

    public abstract AccountType getAccountType();

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
}

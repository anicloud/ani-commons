package com.ani.commons.bus.earth.dto.register;

import com.ani.commons.bus.earth.domain.id.Phone;
import com.ani.commons.bus.earth.dto.id.AccountPhoneInfoDto;
import com.ani.commons.bus.earth.enumeration.AccountType;
import com.ani.commons.bus.earth.enumeration.Sex;
import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-11.
 */
public class AccountTransparentRegisterDto extends AniDto implements Serializable {

    private static final long serialVersionUID = -916630158622659868L;
    private Long accountId;
    private String name;
    private String portraitUrl;
    private AccountType type;
    private AccountPhoneInfoDto phone;
    private Sex sex;
    public AccountTransparentRegisterDto() {
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

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountPhoneInfoDto getPhone() {
        return phone;
    }

    public void setPhone(AccountPhoneInfoDto phone) {
        this.phone = phone;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}

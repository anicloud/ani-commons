package com.ani.commons.earth.dto.info;

import com.ani.commons.earth.domain.id.Phone;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.dto.AniDto;

public class AccountInfoRegistryDto extends AniDto {

    String name;
    AccountType type;
    Phone phoneNum;
    String email;

    public AccountInfoRegistryDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Phone getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Phone phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.ani.commons.earth.dto;

import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AniAccountIdDto extends AniDto{

    Long id;
    PhoneNumDto phoneNumDto;
    String email;

    public AniAccountIdDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PhoneNumDto getPhoneNumDto() {
        return phoneNumDto;
    }

    public void setPhoneNumDto(PhoneNumDto phoneNumDto) {
        this.phoneNumDto = phoneNumDto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.ani.commons.earth.dto;

import com.ani.commons.earth.domain.AniAccountGroup;
import com.ani.commons.earth.domain.PhoneNum;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AniAccountInfoDto extends AniDto{
    Long id;
    String name;
    byte[] password;
    AccountType type;
    PhoneNumDto phoneNumDto;
    String email;
    String portraitUrl;
    List<AniAccountGroupDto> groups;

    public AniAccountInfoDto(Long id, String name, byte[] password, AccountType type, PhoneNumDto phoneNumDto, String email, String portraitUrl, List<AniAccountGroupDto> groups) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.type = type;
        this.phoneNumDto = phoneNumDto;
        this.email = email;
        this.portraitUrl = portraitUrl;
        this.groups = groups;
    }

    public List<AniAccountGroupDto> getGroups() {

        return groups;
    }

    public void setGroups(List<AniAccountGroupDto> groups) {
        this.groups = groups;
    }

    public AniAccountInfoDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
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

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

}

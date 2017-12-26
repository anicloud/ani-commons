package com.ani.commons.earth.domain;

import com.ani.commons.earth.enumeration.AccountType;

import java.util.List;
import java.util.Objects;

public class AniAccount {

    Long id;
    String name;
    byte[] password;
    AccountType type;
    PhoneNum phoneNum;
    String email;
    String portraitUrl;
    List<AniAccountGroup> groups;

    public AniAccount() {
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

    public PhoneNum getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(PhoneNum phoneNum) {
        this.phoneNum = phoneNum;
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

    private Integer hashCode = null;
    
    @Override
    public int hashCode() {
        if(this.hashCode == null)
            this.hashCode = Objects.hashCode(this.id);
        return this.hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode;
    }
}

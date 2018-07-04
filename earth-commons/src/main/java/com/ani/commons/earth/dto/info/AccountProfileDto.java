package com.ani.commons.earth.dto.info;

import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.dto.AniDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public abstract class AccountProfileDto extends AniDto implements Serializable {

    private static final long serialVersionUID = 2503867662892117241L;

    Long accountId;

    String name;

    String fileType;

    String password;

    String userName;

    protected AccountType accountType;


    public AccountProfileDto(Long accountId, String name, String fileType, String password, String userName, AccountType accountType) {
        this.accountId = accountId;
        this.name = name;
        this.fileType = fileType;
        this.password = password;
        this.userName = userName;
        this.accountType = accountType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

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

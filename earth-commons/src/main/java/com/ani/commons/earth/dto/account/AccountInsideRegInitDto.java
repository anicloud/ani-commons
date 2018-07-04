package com.ani.commons.earth.dto.account;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-7-4.
 */
public class AccountInsideRegInitDto implements Serializable {

    private static final long serialVersionUID = 2887018494872600017L;

    private Long accountId;
    private String userName;
    private Boolean isSuccess;

    public AccountInsideRegInitDto(Long accountId, String userName, Boolean isSuccess) {
        this.accountId = accountId;
        this.userName = userName;
        this.isSuccess = isSuccess;
    }

    public AccountInsideRegInitDto() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }
}

package com.ani.commons.earth.dto.register;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-7-6.
 * Last Modified by xuben on 18-7-16.
 */
public class AccountInsideRegInitDto implements Serializable {

    private static final long serialVersionUID = 7383878906884098538L;

    private Long accountId;

    private String employeeStrId;

    private byte[] password;

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getEmployeeStrId() {
        return employeeStrId;
    }

    public void setEmployeeStrId(String employeeStrId) {
        this.employeeStrId = employeeStrId;
    }
}

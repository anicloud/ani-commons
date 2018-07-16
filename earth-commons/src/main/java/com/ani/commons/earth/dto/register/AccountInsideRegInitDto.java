package com.ani.commons.earth.dto.register;

import com.sun.org.apache.xml.internal.serializer.SerializerTrace;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-7-6.
 * Last Modified by xuben on 18-7-16.
 */
public class AccountInsideRegInitDto implements Serializable {

    private static final long serialVersionUID = 7383878906884098538L;

    private Long accountId;

    private Long employeeId;

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

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

}

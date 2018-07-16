package com.ani.commons.earth.domain.verify;


import java.io.Serializable;

/**
 * Created by zhanglina on 18-2-26.
 */
public class VerifyCode implements Serializable{
    private static final long serialVersionUID = 2598921477174630195L;

    String code;

    String sid;

    Long accountId;
//    ContextType contextType;
    String register;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public VerifyCode() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}

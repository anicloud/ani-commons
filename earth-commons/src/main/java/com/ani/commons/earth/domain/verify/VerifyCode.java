package com.ani.commons.earth.domain.verify;

/**
 * Created by zhanglina on 18-2-26.
 */
public abstract class VerifyCode {

    String code;
    Long sid;

//    ContextType contextType;

    public VerifyCode() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

}

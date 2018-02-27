package com.ani.commons.earth.domain.id;

import com.ani.commons.earth.enumeration.ContextType;

/**
 * Created by zhanglina on 18-2-26.
 */
public class VerifyCode {

    String code;
    Long sid;
    ContextType contextType;

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

    public ContextType getContextType() {
        return contextType;
    }

    public void setContextType(ContextType contextType) {
        this.contextType = contextType;
    }
}

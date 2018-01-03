package com.ani.commons.earth.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum AuthState implements BaseEnum<AuthState,Integer>{
    ANONYMOUS(1,"anonymous"),
    AUTHENTICATED(2,"authenticated"),
    REJECTED(3,"rejected");
    private Integer code;
    private String value;

    AuthState(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
    static Map<Integer,AuthState> enumMap = new HashMap<>();
    static {
        for (AuthState authState:AuthState.values()){
            enumMap.put(authState.getCode(),authState);
        }
    }
    @Override
    public Integer getCode() {
        return null;
    }

    @Override
    public String getValue() {
        return null;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

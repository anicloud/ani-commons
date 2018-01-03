package com.ani.commons.earth.enumeration;

public enum AccountType implements BaseEnum<AccountType,Integer>{
        SYSTEM(1,"system"),
        ADMINISTRATOR(2,"administrator"),
    PERSONAL(3,"persion"),
    ORGANIZATION(4,"user");
    private Integer code;
    private String value;

    AccountType(Integer code, String value) {
        this.code = code;
        this.value = value;
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

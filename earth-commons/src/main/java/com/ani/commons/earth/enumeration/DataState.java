package com.ani.commons.earth.enumeration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhanglina on 18-1-3.
 */
public enum  DataState implements BaseEnum<DataState,Integer>{
    ACTIVE(1,"active"),
    DISABLE(2,"disable");
    private Integer code;
    private String value;
    static Map<Integer,DataState> enumMap = new HashMap<>();
    DataState(Integer code,String value){
        this.code=code;
        this.value=value;
    }
    static {
        for (DataState dataState:DataState.values()){
            enumMap.put(dataState.getCode(),dataState);
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
}

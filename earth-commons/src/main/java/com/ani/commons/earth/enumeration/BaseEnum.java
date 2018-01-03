package com.ani.commons.earth.enumeration;

/**
 * Created by zhanglina on 17-12-27.
 */
public interface BaseEnum<E extends Enum<?>,T> {
    public T getCode();
    public String getValue();

}

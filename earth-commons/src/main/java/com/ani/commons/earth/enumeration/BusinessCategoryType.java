package com.ani.commons.earth.enumeration;

/**
 * Created by zhanglina on 18-7-27.
 */
public enum BusinessCategoryType {
    IT(1),
    FINANCE(2),
    CHEMICAL(4),
    HEALTH(8);
    private final Integer id;
    BusinessCategoryType(int id) {
        this.id = id;
    }
    // TODO: 18-7-27 add anothors

    public Integer getId() {
        return id;
    }
}

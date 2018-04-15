package com.ani.commons.site.enumeration;

/**
 * Created by zhanglina on 18-4-3.
 */
public enum AniSiteType {
    MINIAPP(1),
    PUBACCOUNT(2),
    LITGHTAPP(3),
    SINA(4);
    private final int id;

    AniSiteType(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
}

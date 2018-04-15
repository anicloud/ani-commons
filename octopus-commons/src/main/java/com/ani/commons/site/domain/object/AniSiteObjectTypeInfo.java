package com.ani.commons.site.domain.object;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-12.
 */
public abstract class AniSiteObjectTypeInfo implements Serializable{

    private static final long serialVersionUID = 5151173588225453263L;

    protected AniSiteType aniSiteType;

    public abstract AniSiteType getAniSiteType();

}

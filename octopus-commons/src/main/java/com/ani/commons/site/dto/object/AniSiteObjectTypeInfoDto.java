package com.ani.commons.site.dto.object;

import com.ani.commons.site.enumeration.AniSiteType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-12.
 */
public abstract class AniSiteObjectTypeInfoDto implements Serializable {

    private static final long serialVersionUID = -7247601381265335764L;

    protected AniSiteType aniSiteType;

    public abstract AniSiteType getAniSiteType();


}

package com.ani.commons.bus.site.dto.site;

import com.ani.commons.bus.site.enumeration.AniSiteType;
import com.ani.commons.octopus.objmeta.dto.model.AniObjectModelApplicationDto;
import com.ani.commons.octopus.objmeta.object.ObjectType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-15.
 */
public class AniSiteModelApplicationDto extends AniObjectModelApplicationDto implements Serializable{

    private static final long serialVersionUID = 6111303958543928138L;

    public AniSiteModelApplicationDto(){
        this.objectType=ObjectType.SITE;
    }
    @Override
    public ObjectType getObjectType() {
        return this.objectType;
    }
}

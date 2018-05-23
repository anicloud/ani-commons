package com.ani.commons.bus.site.dto.site;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.commons.octopus.objmeta.dto.model.ModelRegisterDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-15.
 */
public class AniSiteModelApplicationDto extends ModelRegisterDto implements Serializable {

    private static final long serialVersionUID = 6111303958543928138L;

    public AniSiteModelApplicationDto() {
        this.objectType = ObjectType.SITE;
    }

    @Override
    public ObjectType getObjectType() {
        return this.objectType;
    }
}

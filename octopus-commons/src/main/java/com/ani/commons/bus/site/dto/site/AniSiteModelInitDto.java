package com.ani.commons.bus.site.dto.site;

import com.ani.commons.octopus.objmeta.dto.model.AniObjectModelInitDto;
import com.ani.commons.octopus.objmeta.object.ObjectType;

/**
 * Created by zhanglina on 18-4-19.
 */
public class AniSiteModelInitDto extends AniObjectModelInitDto {

    private static final long serialVersionUID = -2455430231655936179L;
    public AniSiteModelInitDto(){}
    @Override
    public ObjectType getObjectType() {
        return this.objectType;
    }
}

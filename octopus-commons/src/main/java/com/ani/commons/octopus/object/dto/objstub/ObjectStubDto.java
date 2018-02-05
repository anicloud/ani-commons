package com.ani.commons.octopus.object.dto.objstub;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by yeh on 15-11-12.
 */
public abstract class ObjectStubDto extends AniDto{

    @AniRequiredField
    public Long objectMainId;

    public ObjectStubDto() {}

    public ObjectStubDto(Long objectMainId) {
        this.objectMainId = objectMainId;
    }
    
}
package com.ani.commons.octopus.servicemeta.dto.service.Object;

import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterDto;

/**
 * Created by zhanglina on 18-6-22.
 */
public abstract class ServiceObjectRegisterDto<T extends Object> {
    protected T objectRegisterDto;

    public abstract T getObjectRegisterDto();

    public abstract void setObjectRegisterDto(T objectRegisterDto);
}

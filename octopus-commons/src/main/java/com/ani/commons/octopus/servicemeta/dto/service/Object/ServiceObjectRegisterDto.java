package com.ani.commons.octopus.servicemeta.dto.service.Object;

import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterDto;
import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-6-22.
 */
public abstract class ServiceObjectRegisterDto<T extends ObjectRegisterDto>  extends AniDto {

    private static final long serialVersionUID = -4349205434842751053L;

    protected T objectRegisterDto;

    public ServiceObjectRegisterDto(T objectRegisterDto) {
        this.objectRegisterDto = objectRegisterDto;
    }

    public ServiceObjectRegisterDto() {
    }

    public T getObjectRegisterDto() {
        return (T)objectRegisterDto;
    }

    public void setObjectRegisterDto(T objectRegisterDto) {
        this.objectRegisterDto = objectRegisterDto;
    }
}

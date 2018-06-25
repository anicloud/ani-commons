package com.ani.commons.octopus.servicemeta.dto.service.Object;

import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterForPersonDto;

/**
 * Created by zhanglina on 18-6-25.
 */
public class PersonalServiceObjectRegisterDto extends ServiceObjectRegisterDto<ObjectRegisterForPersonDto>{
    @Override
    public ObjectRegisterForPersonDto getObjectRegisterDto() {
        return (ObjectRegisterForPersonDto)this.objectRegisterDto;
    }

    @Override
    public void setObjectRegisterDto(ObjectRegisterForPersonDto objectRegisterDto) {
        this.objectRegisterDto=(ObjectRegisterForPersonDto)objectRegisterDto;
    }
}

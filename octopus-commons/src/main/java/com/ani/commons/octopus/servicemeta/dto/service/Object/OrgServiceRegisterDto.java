package com.ani.commons.octopus.servicemeta.dto.service.Object;

import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterForOrgDto;

/**
 * Created by zhanglina on 18-6-25.
 */
public class OrgServiceRegisterDto extends ServiceObjectRegisterDto<ObjectRegisterForOrgDto> {
    @Override
    public ObjectRegisterForOrgDto getObjectRegisterDto() {
        return (ObjectRegisterForOrgDto)this.objectRegisterDto;
    }

    @Override
    public void setObjectRegisterDto(ObjectRegisterForOrgDto objectRegisterDto) {
        this.objectRegisterDto=objectRegisterDto;
    }
}

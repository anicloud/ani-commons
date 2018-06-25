package com.ani.commons.octopus.servicemeta.service;

import com.ani.commons.octopus.objmeta.dto.object.ObjectQueryDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterDto;
import com.ani.commons.octopus.servicemeta.domain.object.ServiceObject;
import com.ani.commons.octopus.servicemeta.dto.service.Object.ServiceObjectRegisterDto;

import java.util.List;

/**
 * Created by zhanglina on 18-6-1.
 */
public interface ServiceObjectMetaService {

    public void registerObject(ServiceObjectRegisterDto objectRegisterDto);

    public void batchRegisterObject(List<ServiceObjectRegisterDto> objectRegisterDtos);

    public ServiceObject getServiceObject(ObjectQueryDto objectQueryDto);


    }

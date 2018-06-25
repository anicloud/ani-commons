package com.ani.commons.octopus.servicemeta.service;

import com.ani.commons.octopus.objmeta.dto.object.ObjectQueryDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterDto;
import com.ani.commons.octopus.servicemeta.domain.object.ServiceObject;
import com.ani.commons.octopus.servicemeta.dto.service.Object.ServiceObjectRegisterDto;

/**
 * Created by zhanglina on 18-6-1.
 */
public interface ServiceObjectMetaService {

    public void registerObject(ServiceObjectRegisterDto objectRegisterDto);

    public ServiceObject getServiceObject(ObjectQueryDto objectQueryDto);

    }

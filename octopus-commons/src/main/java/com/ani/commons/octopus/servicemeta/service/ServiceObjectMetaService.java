package com.ani.commons.octopus.servicemeta.service;

import com.ani.commons.octopus.objmeta.dto.object.ObjectQueryDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterDto;
import com.ani.commons.octopus.servicemeta.domain.object.ServiceObject;
import com.ani.commons.octopus.servicemeta.dto.service.Object.ServiceObjectRegisterDto;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

/**
 * Created by zhanglina on 18-6-1.
 */
public interface ServiceObjectMetaService {

    /**
     * <h2>Register a object.</h2>
     * @param objectRegisterDto
     * @throws AniRuleException
     * @throws AniDataException
     */
    public void registerObject(ServiceObjectRegisterDto objectRegisterDto) throws AniRuleException, AniDataException;

    /**
     * <h2>Batch register object.</h2>
     * @param objectRegisterDtos
     * @throws AniRuleException
     * @throws AniDataException
     */
    public void batchRegisterObject(List<ServiceObjectRegisterDto> objectRegisterDtos) throws AniRuleException, AniDataException;

    /**
     * <h2>Query service object.</h2>
     * @param objectQueryDto
     * @return
     * @throws AniRuleException
     * @throws AniDataException
     */
    public ServiceObject getServiceObject(ObjectQueryDto objectQueryDto) throws AniRuleException, AniDataException;


    }

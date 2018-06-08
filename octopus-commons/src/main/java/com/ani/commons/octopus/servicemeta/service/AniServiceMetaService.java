package com.ani.commons.octopus.servicemeta.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelQueryDto;
import com.ani.commons.octopus.objmeta.dto.model.ModelStateUpdateDto;
import com.ani.commons.octopus.objmeta.dto.model.OrgModelQueryDto;
import com.ani.commons.octopus.objmeta.dto.model.OrgNodeModelQueryDto;
import com.ani.commons.octopus.servicemeta.domain.ssostrategy.AniSSOStrategy;
import com.ani.commons.octopus.servicemeta.domain.service.AniDataSynStrategy;
import com.ani.commons.octopus.servicemeta.dto.service.*;
import com.ani.commons.octopus.servicemeta.dto.ssostrategy.AniSSOStrategyRegisterDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

/**
 * Created by zhanglina on 18-5-22.
 */
public interface AniServiceMetaService {

     /**
      * <h2>Add Service.</h2>
      * @param registerDto
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public void addService(AniServiceRegisterDto registerDto) throws AniRuleException, AniDataException;

     /**
      * <h2>Update the Service information.</h2>
      * @param updateDto
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public void updateServiceInfo(AniServiceUpdateDto updateDto) throws  AniRuleException, AniDataException;

     /**
      * <h2>Setting integration strategy.</h2>
      * @param aniSSOStrategyDto
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public void setSSOStrategy(AniSSOStrategyRegisterDto aniSSOStrategyDto) throws  AniRuleException, AniDataException;

     /**
      * <h2>Add data synchronization Strategy.</h2>
      * @param registerDto
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public void addDataSynStrategy(AniDataSynStrategyRegisterDto registerDto) throws  AniRuleException, AniDataException;

     /**
      * <h2>Delete Service.</h2>
      * @param modelQueryDto
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public void removeService(ModelQueryDto modelQueryDto)throws  AniRuleException, AniDataException;

     /**
      *<h2>Query basic information.</h2>
      * @param modelQueryDto
      * @return AniServiceInfoDto
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public AniServiceInfoDto getAniServiceById(ModelQueryDto modelQueryDto) throws  AniRuleException, AniDataException;

     /**
      * <h2>Query integration strategy.</h2>
      * @param modelQueryDto
      * @return AniSSOStrategy
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public AniSSOStrategy getSSOStrategyByService(ModelQueryDto modelQueryDto) throws  AniRuleException, AniDataException;

     /**
      * <h2>Query data synchronization Strategy.</h2>
      * @param modelQueryDto
      * @return AniDataSynStrategy
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public AniDataSynStrategy getDataSynStrategy(ModelQueryDto modelQueryDto) throws  AniRuleException, AniDataException;

     /**
      * <h2>Update Service State (1.ACTIVE/2.DISABLE/3.REMOVED).</h2>
      * @param modelStateUpdateDto
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public void updateServiceState(ModelStateUpdateDto modelStateUpdateDto)  throws  AniRuleException, AniDataException ;

     /**
      * <h2>Query the list of OrgModel by orgId.</h2>
      * @param orgModelQueryDto
      * @return List<ServiceBriefInfoDto>
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public List<ServiceBriefInfoDto> getServiceBasicInfoByOrgId(OrgModelQueryDto orgModelQueryDto) throws  AniRuleException, AniDataException;

     /**
      * <h2>Query the list of OrgModel by nodeId.</h2>
      * @param orgNodeModelQueryDto
      * @return List<ServiceBriefInfoDto>
      * @throws AniAuthException
      * @throws AniRuleException
      * @throws AniDataException
      */
     public List<ServiceBriefInfoDto> getServiceBasicInfoByNodeId(OrgNodeModelQueryDto orgNodeModelQueryDto) throws  AniRuleException, AniDataException;

     /**
      * <h2>Query the list of Service by accountId.</h2>
      * @param accountId
      * @return List<AniServiceBriefInfoDto>
      */
     public List<AniServiceBriefInfoDto> getServiceBriefInfoByAccountId(Long accountId) throws  AniRuleException, AniDataException;;

}

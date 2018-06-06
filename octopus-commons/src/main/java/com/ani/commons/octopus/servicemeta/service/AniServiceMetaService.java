package com.ani.commons.octopus.servicemeta.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelQueryDto;
import com.ani.commons.octopus.objmeta.dto.model.OrgModelQueryDto;
import com.ani.commons.octopus.objmeta.dto.model.OrgNodeModelQueryDto;
import com.ani.commons.octopus.servicemeta.domain.ssostrategy.AniSSOStrategy;
import com.ani.commons.octopus.servicemeta.domain.service.AniDataSynStrategy;
import com.ani.commons.octopus.servicemeta.domain.service.AniDataSynStrategy;
import com.ani.commons.octopus.servicemeta.domain.ssostrategy.AniSSOStrategy;
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

     public void addService(AniServiceRegisterDto registerDto) throws AniRuleException,AniDataException;

     public void updateServiceInfo(AniServiceUpdateDto updateDto) throws AniAuthException;

     public void setSSOStrategy(AniSSOStrategyRegisterDto aniSSOStrategyDto) throws AniAuthException;

     public void addDataSynStrategy(AniDataSynStrategyRegisterDto registerDto) throws AniAuthException;

     public void removeService(ModelQueryDto modelQueryDto)throws AniAuthException;

     public AniServiceInfoDto getAniServiceById(ModelQueryDto modelQueryDto) throws AniAuthException, AniRuleException;

     public AniSSOStrategy getSSOStrategyByService(ModelQueryDto modelQueryDto) throws AniAuthException;

     public AniDataSynStrategy getDataSysStrategy(ModelQueryDto modelQueryDto) throws AniAuthException;

     public void updateServiceState(ServiceStateUpdateDto serviceStateUpdateDto) throws AniAuthException;

     public List<AniServiceBasicInfoDto> getServiceBasicInfoByOrgId(OrgModelQueryDto orgModelQueryDto);

     public List<AniServiceBasicInfoDto> getServiceBasicInfoByNodeId(OrgNodeModelQueryDto orgNodeModelQueryDto);

     public List<AniServiceBriefInfoDto> getServiceBriefInfoByAccountId(Long accountId);

//     public List<AniServiceBasicInfo> getServiceBasicInfoByAccountId(Long accountId);

}

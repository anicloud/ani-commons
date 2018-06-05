package com.ani.commons.octopus.servicemeta.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelQueryDto;
import com.ani.commons.octopus.objmeta.dto.model.OrgModelQueryDto;
import com.ani.commons.octopus.objmeta.dto.model.OrgNodeModelQueryDto;
import com.ani.commons.octopus.servicemeta.domain.service.AniDataSynStrategy;
import com.ani.commons.octopus.servicemeta.domain.service.AniServiceBasicInfo;
import com.ani.commons.octopus.servicemeta.domain.service.AniServiceBriefInfo;
import com.ani.commons.octopus.servicemeta.domain.service.AniServiceInfo;
import com.ani.commons.octopus.servicemeta.domain.ssostrategy.AniSSOStrategy;
import com.ani.commons.octopus.servicemeta.dto.AniDataSynStrategyDto;
import com.ani.commons.octopus.servicemeta.dto.service.*;
import com.ani.commons.octopus.servicemeta.dto.ssostrategy.AniSSOStrategyDto;
import com.ani.utils.exception.AniAuthException;

import java.util.List;

/**
 * Created by zhanglina on 18-5-22.
 */
public interface AniServiceMetaService {

     public void addService(AniServiceRegisterDto registerDto) throws AniAuthException;

     public void updateServiceInfo(AniServiceUpdateDto updateDto) throws AniAuthException;

     public void setSSOStrategy(AniSSOStrategyDto aniSSOStrategyDto) throws AniAuthException;

     public void addDataSysStrategy(AniDataSynStrategyDto dataSynStrategyDto) throws AniAuthException;

     public void removeService(ModelQueryDto modelQueryDto)throws AniAuthException;

     public AniServiceInfo getAniServiceInfoById(ModelQueryDto modelQueryDto) throws AniAuthException;

     public AniSSOStrategy getSSOStrategyByService(ModelQueryDto modelQueryDto) throws AniAuthException;

     public AniDataSynStrategy getDataSysStrategy(ModelQueryDto modelQueryDto) throws AniAuthException;

     public void updateServiceState(AniServiceStateDto aniServiceStateDto) throws AniAuthException;

     public List<AniServiceBasicInfo> getServiceBasicInfoByOrgId(OrgModelQueryDto orgModelQueryDto);

     public List<AniServiceBasicInfo> getServiceBasicInfoByNodeId(OrgNodeModelQueryDto orgNodeModelQueryDto);

     public List<AniServiceBriefInfo> getServiceBriefInfoByAccountId(Long accountId);

//     public List<AniServiceBasicInfo> getServiceBasicInfoByAccountId(Long accountId);

}

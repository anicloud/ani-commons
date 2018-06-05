package com.ani.commons.octopus.servicemeta.service;

import com.ani.commons.octopus.objmeta.dto.model.OrgModelQueryDto;
import com.ani.commons.octopus.servicemeta.domain.service.AniDataSynStrategy;
import com.ani.commons.octopus.servicemeta.domain.service.AniServiceBasicInfo;
import com.ani.commons.octopus.servicemeta.domain.service.AniServiceBriefInfo;
import com.ani.commons.octopus.servicemeta.domain.service.AniServiceInfo;
import com.ani.commons.octopus.servicemeta.domain.ssostrategy.AniSSOStrategy;
import com.ani.commons.octopus.servicemeta.dto.AniDataSynStrategyDto;
import com.ani.commons.octopus.servicemeta.dto.service.AniServiceDto;
import com.ani.commons.octopus.servicemeta.dto.service.AniServiceOpDto;
import com.ani.commons.octopus.servicemeta.dto.service.AniServiceStateDto;
import com.ani.commons.octopus.servicemeta.dto.account.AccountOpDto;
import com.ani.commons.octopus.servicemeta.dto.ssostrategy.AniSSOStrategyDto;
import com.ani.utils.exception.AniAuthException;

import java.util.List;

/**
 * Created by zhanglina on 18-5-22.
 */
public interface AniServiceMetaService {

     public void addService(AniServiceDto serviceDto) throws AniAuthException;

     public void updateServiceInfo(AniServiceDto serviceDto) throws AniAuthException;

     public void setSSOStrategy(AniSSOStrategyDto aniSSOStrategyDto) throws AniAuthException;

     public void addDataSysStrategy(AniDataSynStrategyDto dataSynStrategyDto) throws AniAuthException;

     public void removeService(AniServiceOpDto serviceOpDto)throws AniAuthException;

     public AniServiceInfo getAniServiceInfoById(AniServiceOpDto serviceOpDto) throws AniAuthException;

     public AniSSOStrategy getSSOStrategyByService(AniServiceOpDto serviceOpDto) throws AniAuthException;

     public AniDataSynStrategy getDataSysStrategy(AniServiceOpDto serviceOpDto) throws AniAuthException;

     public void updateServiceState(AniServiceStateDto aniServiceStateDto) throws AniAuthException;

     public List<AniServiceBasicInfo> getServiceBasicInfo(AccountOpDto accountOpDto) throws AniAuthException;

     public List<AniServiceBasicInfo> getServiceBasicInfoByOrgId(OrgModelQueryDto orgModelQueryDto);

     public List<AniServiceBasicInfo> getServiceBasicInfoByNodeId(OrgModelQueryDto orgModelQueryDto);

     public List<AniServiceBriefInfo> getServiceBriefInfoByAccountId(Long accountId);


}

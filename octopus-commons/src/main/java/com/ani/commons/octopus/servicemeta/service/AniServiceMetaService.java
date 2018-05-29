package com.ani.commons.octopus.servicemeta.service;

import com.ani.commons.octopus.servicemeta.dto.AniServiceDto;
import com.ani.commons.octopus.servicemeta.dto.ssostrategy.AniSSOStrategyDto;

/**
 * Created by zhanglina on 18-5-22.
 */
public interface AniServiceMetaService {
     public void registerService(AniServiceDto serviceDto);
     public void addSSOStrategy(AniSSOStrategyDto aniSSOStrategyDto);
     public void removeService(Long serviceId);
//     public
}

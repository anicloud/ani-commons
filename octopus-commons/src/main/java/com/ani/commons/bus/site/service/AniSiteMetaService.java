package com.ani.commons.bus.site.service;

import com.ani.commons.bus.site.domain.site.AniSite;
import com.ani.commons.bus.site.dto.site.AniSiteModelApplicationDto;
import com.ani.commons.bus.site.dto.site.AniSiteModelInitDto;
import com.ani.commons.bus.site.dto.site.AniWCMetaSubmitDto;
import com.ani.utils.exception.AniRuleException;

/**
 * Created by zhanglina on 18-4-2.
 */
public interface AniSiteMetaService {

    public AniSiteModelInitDto applySite(AniSiteModelApplicationDto siteApply) throws AniRuleException;

    public AniSite submitWcSite(AniWCMetaSubmitDto wcMetaSubmit);

    public AniSite findSiteModelById(Long modelId);


}
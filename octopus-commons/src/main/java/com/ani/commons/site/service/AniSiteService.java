package com.ani.commons.site.service;

import com.ani.commons.site.domain.site.AniSite;
import com.ani.commons.site.dto.site.AniSiteDto;
import com.ani.commons.site.dto.site.AniSiteRegisterDto;

import java.util.List;

/**
 * Created by zhanglina on 18-4-2.
 */
public interface AniSiteService {
    public AniSite register(AniSiteRegisterDto siteRegister);
    public AniSite update(AniSiteDto siteRegisterDto);
    public List<AniSite> getAniSiteByDevAccountId(String accountId);
    public void checkClientSecret(String aniSiteId, String clientSecret);
}

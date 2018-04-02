package com.ani.commons.site.service;

import com.ani.commons.site.domain.AccountSiteInfo;
import com.ani.commons.site.domain.AniSite;
import com.ani.commons.site.dto.AniSiteRegisterDto;

import java.util.List;

/**
 * Created by zhanglina on 18-4-2.
 */
public interface AniSiteService {
    public AniSite register(AniSiteRegisterDto siteRegisterDto);
    public List<AniSite> getAniSiteByDevAccountId(Long accountId);
    public List<AccountSiteInfo> getAccountInfoByAniSite(Long aniSiteId);
    public void checkClientSecret(Long aniSiteId, String clientSecret);
}

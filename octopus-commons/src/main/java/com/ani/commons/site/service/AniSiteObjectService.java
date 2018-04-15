package com.ani.commons.site.service;

import com.ani.commons.site.domain.stub.AniStubDto;

/**
 * Created by zhanglina on 18-4-2.
 */
public interface AniSiteObjectService {
    public void registerObject(String accountId,String aniSiteId);
    public void logout();
}

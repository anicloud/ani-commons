package com.ani.commons.site.service;

import com.ani.commons.site.domain.stub.AniStub;

/**
 * Created by zhanglina on 18-4-2.
 */
public interface AniSiteObjectService {
    public void registerAndLogin(Long AccountId,Long aniSiteId,String sessionId);
    public void logout(Long AccountId,Long aniSiteId,String sessionId);
    public void invokeObjectStub(AniStub aniStub, Long aniSiteId);
}

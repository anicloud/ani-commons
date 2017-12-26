package com.ani.commons.earth.domain;

import java.util.Map;

public class AniApp {

    Long appId;
    String appName;
    String appDesc;
    String baseUrl;
    String appToken;
    Map<Long, Long> clientsSidAccountId;

    public AniApp() {
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public Map<Long, Long> getClientsSidAccountId() {
        return clientsSidAccountId;
    }

    public void setClientsSidAccountId(Map<Long, Long> clientsSidAccountId) {
        this.clientsSidAccountId = clientsSidAccountId;
    }

    /**
     * Set application session info
     * <ul>
     *     <li>
     *         Check account info into Set values of key:<br/>
     *         earth:[appId]:[sid] = Set[accountId]<br/>
     *         in Redis
     *     </li>
     *     <li>
     *         Insert current sessionId and accountId into Redis Set
     *     </li>
     *     <li>
     *         App session info updated, all hosts sync from Redis
     *     </li>
     * </ul>
     * @param appSid
     * @param
     * @exception com.ani.utils.exception.AniDataException App sid conflicted.
     */
    private void setClientSidAccount(Long appSid, AniAccount account) {
        //TODO:
    }
}

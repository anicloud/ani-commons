package com.ani.commons.site.domain.stub;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-2.
 */
public class AniStub implements Serializable{
    private static final long serialVersionUID = 5225033334528983067L;
    public Long targetObjectId;
    public Integer targetSlaveId;
    public Long accountId;

    public Long getTargetObjectId() {
        return targetObjectId;
    }
    public void setTargetObjectId(Long targetObjectId) {
        this.targetObjectId = targetObjectId;
    }

    public Integer getTargetSlaveId() {
        return targetSlaveId;
    }

    public void setTargetSlaveId(Integer targetSlaveId) {
        this.targetSlaveId = targetSlaveId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}

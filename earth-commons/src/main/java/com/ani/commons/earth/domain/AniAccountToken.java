package com.ani.commons.earth.domain;

import com.ani.utils.core.AniByte;

import java.util.Date;

/**
 * Created by zhanglina on 18-3-8.
 */
public class AniAccountToken {
    AniByte tgt;
    Long accountId;
    Date lastOp;

    public AniByte getTgt() {
        return tgt;
    }

    public void setTgt(AniByte tgt) {
        this.tgt = tgt;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Date getLastOp() {
        return lastOp;
    }

    public void setLastOp(Date lastOp) {
        this.lastOp = lastOp;
    }
}

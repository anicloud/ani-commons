package com.ani.commons.earth.domain;

import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.CurUserType;
import com.ani.utils.core.AniByte;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhanglina on 18-3-8.
 */
public class AniAccountToken implements Serializable {
    private static final long serialVersionUID = 8818731541882481867L;
    String tgt;
    Long accountId;//personal accountId,org employeeId
    CurUserType curUserType;
    Date lastOp;

    public AniAccountToken() {
    }

    public AniAccountToken(String tgt, Long accountId, CurUserType curUserType, Date lastOp) {
        this.tgt = tgt;
        this.accountId = accountId;
        this.curUserType = curUserType;
        this.lastOp = lastOp;
    }

    public CurUserType getCurUserType() {
        return curUserType;
    }

    public void setCurUserType(CurUserType curUserType) {
        this.curUserType = curUserType;
    }

    public String getTgt() {
        return tgt;
    }

    public void setTgt(String tgt) {
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

package com.ani.commons.earth.domain;
import java.io.Serializable;
/**
 * Created by zhanglina on 18-3-8.
 */
public class AniAccountToken implements Serializable {
    private static final long serialVersionUID = 8818731541882481867L;

    String tgt;

    Short index;

    Long[] accounts;

    public AniAccountToken() {
    }

    public AniAccountToken(String tgt, Short index, Long[] accounts) {
        this.tgt = tgt;
        this.index = index;
        this.accounts = accounts;
    }

    public String getTgt() {
        return tgt;
    }

    public void setTgt(String tgt) {
        this.tgt = tgt;
    }

    public Short getIndex() {
        return index;
    }

    public void setIndex(Short index) {
        this.index = index;
    }

    public Long[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Long[] accounts) {
        this.accounts = accounts;
    }
}

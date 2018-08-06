package com.ani.commons.earth.domain;
import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-3-8.
 */
public class AniAccountToken implements Serializable {
    private static final long serialVersionUID = 8818731541882481867L;

    String tgt;

    Short index;

    List<Long> accounts;

    public AniAccountToken() {
    }

    public void setAccounts(List<Long> accounts) {
        this.accounts = accounts;
    }

    public List<Long> getAccounts() {
        return accounts;
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

    public AniAccountToken(String tgt, Short index, List accounts) {
        this.tgt = tgt;
        this.index = index;
        this.accounts = accounts;
    }
}

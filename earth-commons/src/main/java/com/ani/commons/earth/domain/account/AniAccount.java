package com.ani.commons.earth.domain.account;
import com.ani.commons.earth.domain.id.Phone;
import com.ani.commons.earth.enumeration.AccountType;

import java.io.Serializable;
import java.util.Objects;
public abstract class AniAccount implements Serializable{

    private static final long serialVersionUID = -1997253108936634154L;
    /**
     * Account logic id
     */
    Long accountId;

    /**
     * Have set password
     */
    Boolean hasPwd;

    /**
     * Account valueType
     */
    AccountType type;

    /**
     * File path rule: /[accountId]/[portraitId](timestamp).jpg
     */
    Long portraitId;

    public AniAccount() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Boolean getHasPwd() {
        return hasPwd;
    }

    public void setHasPwd(Boolean hasPwd) {
        this.hasPwd = hasPwd;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Long getPortraitId() {
        return portraitId;
    }

    public void setPortraitId(Long portraitId) {
        this.portraitId = portraitId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.accountId);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}

package com.ani.commons.earth.dto.register;

import com.ani.commons.earth.dto.id.AccountIdInfoDto;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-11.
 */
public abstract class AccountRegisterDto<T extends AccountIdInfoDto> extends AniDto implements Serializable{

    private static final long serialVersionUID = 8562638164025379202L;

    @AniRequiredField
    protected AccountIdInfoDto accountId;

    @AniRequiredField
    protected AccountType type;

    @AniRequiredField
    protected String verificationCode;

    public AccountRegisterDto() {
    }

    public abstract T getAccountId();

    public abstract void setAccountId(T accountId);

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}

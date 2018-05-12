package com.ani.commons.earth.dto.register;

import com.ani.commons.earth.dto.id.AccountPhoneInfoDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-11.
 */
public class AccountPhoneRegisterDto extends AccountRegisterDto<AccountPhoneInfoDto> implements Serializable{

    private static final long serialVersionUID = 2112206023246171289L;

    public AccountPhoneRegisterDto() {
    }

    @Override
    public AccountPhoneInfoDto getAccountId() {
        return (AccountPhoneInfoDto) this.accountId;
    }

    @Override
    public void setAccountId(AccountPhoneInfoDto phone) {
        this.accountId = phone;
    }

}

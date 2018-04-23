package com.ani.commons.bus.earth.dto.register;

import com.ani.commons.bus.earth.dto.id.AccountEmailInfoDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-11.
 */
public class AccountEmailRegisterDto extends AccountRegisterDto<AccountEmailInfoDto> implements Serializable {

    private static final long serialVersionUID = -916630158622659868L;

    public AccountEmailRegisterDto() {
    }

    @Override
    public AccountEmailInfoDto getAccountId() {
        return (AccountEmailInfoDto) this.accountId;
    }

    @Override
    public void setAccountId(AccountEmailInfoDto email) {
        this.accountId = email;
    }

}

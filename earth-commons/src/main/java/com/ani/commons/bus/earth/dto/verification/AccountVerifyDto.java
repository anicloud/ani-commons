package com.ani.commons.bus.earth.dto.verification;

import com.ani.commons.bus.earth.dto.id.AccountIdInfoDto;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.io.Serializable;

public abstract class AccountVerifyDto extends AniDto implements Serializable {

    private static final long serialVersionUID = -3010439793781186488L;

    @AniRequiredField
    private AccountIdInfoDto accountIdInfoDto;

//    @AniRequiredField
//    private AniAccountAuthDto accountAuthDto;

    public AccountVerifyDto() {
    }

    public AccountIdInfoDto getAccountIdInfoDto() {
        return accountIdInfoDto;
    }

    public void setAccountIdInfoDto(AccountIdInfoDto accountIdInfoDto) {
        this.accountIdInfoDto = accountIdInfoDto;
    }


//    public AniAccountAuthDto getAccountAuthDto() {
//        return accountAuthDto;
//    }
//
//    public void setAccountAuthDto(AniAccountAuthDto accountAuthDto) {
//        this.accountAuthDto = accountAuthDto;
//    }
}

package com.ani.commons.earth.dto.id;

import com.ani.commons.earth.enumeration.AccountType;
import com.ani.utils.dto.AniFieldFormat;
import com.ani.utils.dto.AniPattern;
import com.ani.utils.dto.AniRequiredField;

import java.io.Serializable;

/**
 * Created by zhanglina on 17-12-29.
 */
public class AccountEmailInfoDto extends AccountIdInfoDto implements Serializable {

    private static final long serialVersionUID = -7282244745118202284L;
    @AniRequiredField
    @AniFieldFormat(pattern = AniPattern.EMAIL_PATTERN)
    private String email;

    public AccountEmailInfoDto() {
    }

    public AccountEmailInfoDto(Long accountId, AccountType type, String email) {
        super(accountId, type);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

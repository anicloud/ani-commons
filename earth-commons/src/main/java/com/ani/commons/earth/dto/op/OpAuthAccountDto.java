package com.ani.commons.earth.dto.op;

import com.ani.utils.dto.AniRequiredField;

public class OpAuthAccountDto extends OpAuthDto {

    @AniRequiredField
    private Long targetAccount;

    public OpAuthAccountDto() {
    }

    public OpAuthAccountDto(Long opAccountId, Long targetAccount) {
        super(opAccountId);
        this.targetAccount = targetAccount;
    }

    public Long getTargetAccount() {
        return targetAccount;
    }

    public void setTargetAccount(Long targetAccount) {
        this.targetAccount = targetAccount;
    }
}

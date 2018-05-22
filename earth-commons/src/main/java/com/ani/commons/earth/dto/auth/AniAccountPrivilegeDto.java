package com.ani.commons.earth.dto.auth;

import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.io.Serializable;

public class AniAccountPrivilegeDto extends AniDto implements Serializable {

    private static final long serialVersionUID = 7317114042514572675L;

    @AniRequiredField
    private Long accountId;
    @AniRequiredField
    private PrivilegeType privilege;

    public AniAccountPrivilegeDto() {}

    public AniAccountPrivilegeDto(Long accountId, PrivilegeType privilege) {
        this.accountId = accountId;
        this.privilege = privilege;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public PrivilegeType getPrivilege() {
        return privilege;
    }

    public void setPrivilege(PrivilegeType privilege) {
        this.privilege = privilege;
    }
}

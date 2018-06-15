package com.ani.commons.earth.dto.account;

import com.ani.utils.core.data.type.PrivacyType;
import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-14.
 */
public abstract class AccessibilityDto extends AniDto {

    private static final long serialVersionUID = 4311476169839110844L;

    private Long requestAccountId;

    private PrivilegeType privilegeType;

    public AccessibilityDto() {}

    public AccessibilityDto(Long requestAccountId, PrivilegeType privilegeType) {
        this.requestAccountId = requestAccountId;
        this.privilegeType = privilegeType;
    }

    public Long getRequestAccountId() {
        return requestAccountId;
    }

    public void setRequestAccountId(Long requestAccountId) {
        this.requestAccountId = requestAccountId;
    }

    public PrivilegeType getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(PrivilegeType privilegeType) {
        this.privilegeType = privilegeType;
    }
}

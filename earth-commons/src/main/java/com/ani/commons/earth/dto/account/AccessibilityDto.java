package com.ani.commons.earth.dto.account;

import com.ani.utils.core.data.type.PrivacyType;
import com.ani.utils.core.data.type.PrivilegeType;
import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-14.
 */
public class AccessibilityDto extends AniDto {

    private static final long serialVersionUID = 4311476169839110844L;

    private Long requestAccountId;

    private PrivacyType privacy;


    public AccessibilityDto() {}

    public AccessibilityDto(Long requestAccountId, Long resourceOwnerAccountId, PrivacyType privacy, PrivilegeType privilegeType) {
        this.requestAccountId = requestAccountId;
        this.resourceOwnerAccountId = resourceOwnerAccountId;
        this.privacy = privacy;
        this.privilegeType = privilegeType;
    }

    public Long getRequestAccountId() {
        return requestAccountId;
    }

    public void setRequestAccountId(Long requestAccountId) {
        this.requestAccountId = requestAccountId;
    }

    public Long getResourceOwnerAccountId() {
        return resourceOwnerAccountId;
    }

    public void setResourceOwnerAccountId(Long resourceOwnerAccountId) {
        this.resourceOwnerAccountId = resourceOwnerAccountId;
    }

    public PrivacyType getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyType privacy) {
        this.privacy = privacy;
    }

    public PrivilegeType getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(PrivilegeType privilegeType) {
        this.privilegeType = privilegeType;
    }
}

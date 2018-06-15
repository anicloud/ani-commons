package com.ani.commons.earth.dto.account;

import com.ani.utils.core.data.type.PrivacyType;
import com.ani.utils.core.data.type.PrivilegeType;

/**
 * Created by zhanglina on 18-6-15.
 */
public class PersonalAccessibilityDto extends AccessibilityDto{

    private Long resourceOwnerAccountId;
    private PrivacyType privacy;

    public PersonalAccessibilityDto() {
    }

    public PersonalAccessibilityDto(Long requestAccountId, PrivilegeType privilegeType, Long resourceOwnerAccountId, PrivacyType privacy) {
        super(requestAccountId, privilegeType);
        this.resourceOwnerAccountId = resourceOwnerAccountId;
        this.privacy = privacy;
    }

    public PrivacyType getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyType privacy) {
        this.privacy = privacy;
    }

    public Long getResourceOwnerAccountId() {
        return resourceOwnerAccountId;
    }

    public void setResourceOwnerAccountId(Long resourceOwnerAccountId) {
        this.resourceOwnerAccountId = resourceOwnerAccountId;
    }
}

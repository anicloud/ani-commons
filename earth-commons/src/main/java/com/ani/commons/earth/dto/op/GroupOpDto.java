package com.ani.commons.earth.dto.op;

import com.ani.utils.dto.AniRequiredField;

/**
 * Created by changhan on 18-8-19.
 */
public class GroupOpDto extends OpDto {

    private Long privacyGroupId;

    public GroupOpDto() {
    }

    public GroupOpDto(Long opAccountId, Long privacyGroupId) {
        super(opAccountId);
        this.privacyGroupId = privacyGroupId;
    }

    public Long getPrivacyGroupId() {
        return privacyGroupId;
    }

    public void setPrivacyGroupId(Long privacyGroupId) {
        this.privacyGroupId = privacyGroupId;
    }
}

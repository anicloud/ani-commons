package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.utils.core.data.type.PrivacyType;
import com.ani.utils.dto.AniRequiredField;

public class ModelPrivacyUpdateDto extends ModelDto {

    @AniRequiredField
    private Long opAccountId;
    @AniRequiredField
    private PrivacyType privacy;

    public ModelPrivacyUpdateDto() {
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

    public PrivacyType getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyType privacy) {
        this.privacy = privacy;
    }
}

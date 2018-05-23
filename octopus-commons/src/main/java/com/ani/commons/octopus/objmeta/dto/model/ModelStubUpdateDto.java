package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.octopus.objmeta.dto.meta.StubUpdateDto;
import com.ani.utils.core.Operation;
import com.ani.utils.dto.AniRequiredField;

public class ModelStubUpdateDto extends ModelDto {

    private static final long serialVersionUID = -5809111207521868666L;

    private Long opAccountId;
    @AniRequiredField
    private StubUpdateDto stubsUpdate;

    public ModelStubUpdateDto() {
    }

    public ModelStubUpdateDto(Long modelId, Long opAccountId, StubUpdateDto stubsUpdate) {
        super(modelId);
        this.opAccountId = opAccountId;
        this.stubsUpdate = stubsUpdate;
    }

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

    public StubUpdateDto getStubsUpdate() {
        return stubsUpdate;
    }

    public void setStubsUpdate(StubUpdateDto stubsUpdate) {
        this.stubsUpdate = stubsUpdate;
    }
}

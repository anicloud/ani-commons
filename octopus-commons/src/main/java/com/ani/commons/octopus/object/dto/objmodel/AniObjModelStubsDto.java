package com.ani.commons.octopus.object.dto.objmodel;

import com.ani.commons.octopus.object.enumeration.AniObjectType;
import com.ani.commons.octopus.objmeta.stub.dto.StubDto;
import com.ani.utils.core.AniByte;
import com.ani.utils.dto.AniDto;

import java.util.Set;

/**
 * @author yeh
 */
public class AniObjModelStubsDto extends AniDto {

    Long modelId;

    Set<StubDto> stubs;

    public AniObjModelStubsDto() {
    }

    public AniObjModelStubsDto(Long modelId, Set<StubDto> stubs) {
        this.modelId = modelId;
        this.stubs = stubs;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Set<StubDto> getStubs() {
        return stubs;
    }

    public void setStubs(Set<StubDto> stubs) {
        this.stubs = stubs;
    }
}

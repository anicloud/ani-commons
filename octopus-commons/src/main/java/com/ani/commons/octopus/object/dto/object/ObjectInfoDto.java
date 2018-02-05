package com.ani.commons.octopus.object.dto.object;

import com.ani.commons.octopus.object.enumeration.DataState;
import com.ani.commons.octopus.objmeta.stub.dto.StubInfoDto;
import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by yeh on 15-10-18.
 */
public abstract class ObjectInfoDto extends AniDto{

    public List<StubInfoDto> stubs;

    public DataState dataState;

    public ObjectInfoDto() {
    }

    public ObjectInfoDto(List<StubInfoDto> stubs, DataState dataState) {
        this.stubs = stubs;
        this.dataState = dataState;
    }
}

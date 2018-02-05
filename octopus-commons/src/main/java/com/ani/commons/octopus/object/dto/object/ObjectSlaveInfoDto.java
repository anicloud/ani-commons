package com.ani.commons.octopus.object.dto.object;

import com.ani.commons.octopus.object.enumeration.DataState;
import com.ani.commons.octopus.objmeta.stub.dto.StubInfoDto;
import com.ani.commons.octopus.objstate.domain.ObjectSlaveState;

import java.util.List;

/**
 * Created by yeh on 15-12-1.
 */
public class ObjectSlaveInfoDto extends ObjectInfoDto {

    private static final long serialVersionUID = 5327411969701236213L;

//    public AniObjectState state;

    public ObjectSlaveState objectSlaveState;

    public Integer objectSlaveId;

    private ObjectMainInfoDto slaveMain;

    public ObjectMainInfoDto getSlaveMain() {
        return this.slaveMain;
    }

    public ObjectSlaveInfoDto() {
    }

    public ObjectSlaveInfoDto(ObjectSlaveState objectSlaveState) {
        this.objectSlaveState = objectSlaveState;
    }

    public ObjectSlaveInfoDto(List<StubInfoDto> stubs, DataState dataState, ObjectSlaveState objectSlaveState) {
        super(stubs, dataState);
        this.objectSlaveState = objectSlaveState;
    }

    public ObjectSlaveInfoDto(List<StubInfoDto> stubs, DataState dataState, Integer objectSlaveId) {
        super(stubs, dataState);
        this.objectSlaveId = objectSlaveId;
    }

    public ObjectSlaveInfoDto(List<StubInfoDto> stubs, DataState dataState, Integer objectSlaveId, ObjectMainInfoDto mainInfoDto) {
        super(stubs, dataState);
        this.objectSlaveId = objectSlaveId;
        this.slaveMain = mainInfoDto;
    }
}

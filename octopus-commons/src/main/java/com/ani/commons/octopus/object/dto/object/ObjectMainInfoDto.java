package com.ani.commons.octopus.object.dto.object;

import com.ani.octopus.commons.account.dto.AccountDto;
import com.ani.commons.octopus.object.dto.object.privilege.ObjectMainPrivilegeDto;
import com.ani.commons.octopus.object.enumeration.AniObjectType;
import com.ani.commons.octopus.object.enumeration.DataState;
import com.ani.commons.octopus.objmeta.stub.dto.StubInfoDto;
import com.ani.commons.octopus.objstate.domain.ObjectMainState;

import java.util.List;

/**
 * Created by yeh on 15-12-1.
 */
public class ObjectMainInfoDto extends ObjectInfoDto {

    private static final long serialVersionUID = -4427768507587282409L;
    public Long objectId;

    public String uniId;

    public AccountDto owner;

    public AniObjectType objectType;

    public List<ObjectMainPrivilegeDto> privileges;

    public ObjectMainState objectMainState;

//    public Map<AniByte, AniObjectState> hostsState;

    public List<ObjectSlaveInfoDto> slaves;

    public ObjectMainInfoDto(Long objectId) {
        this.objectId = objectId;
    }

    public ObjectMainInfoDto(List<StubInfoDto> stubs, DataState dataState, Long objectId) {
        super(stubs, dataState);
        this.objectId = objectId;
    }
}

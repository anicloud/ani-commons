package com.ani.commons.octopus.objmeta.service;

import com.ani.commons.octopus.objmeta.domain.AniObjectMaster;
import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.commons.octopus.objmeta.dto.meta.AniMetaDto;
import com.ani.commons.octopus.objmeta.dto.meta.StateMachineDto;
import com.ani.commons.octopus.objmeta.dto.meta.StateMachineUpdateDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectInfoUpdateDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterDto;

import java.util.List;

/**
 * Created by zhanglina on 18-3-29.
 */
public interface AniObjectService {

    public void registerObjectMaster(ObjectRegisterDto registerDto);

    public void updateObjectMaster(ObjectInfoUpdateDto updateDto);

    public AniObjectMaster getObjectMaster(long objectId);

    public List<AniObjectMaster> getObjectMasterByOwnerId(long accountId);

    public List<AniObjectMaster> getObjectMasterByOwnerIdAndType(long accountId, ObjectType type);

    public List<AniObjectMaster> getObjectMasterByDevAccountId(long accountId);

    public void bindAccount(Long objectId, Long accountId);

    public void releaseFromAccount(Long objectId);

    public void updateObjectStub(Long objectId, List<AniMetaDto> stubs, boolean isFull);

    public void updateObjectStateMachines(Long objectId, List<StateMachineUpdateDto> stateMachine, boolean isFull);

}

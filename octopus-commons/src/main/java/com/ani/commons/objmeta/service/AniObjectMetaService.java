package com.ani.commons.objmeta.service;

import com.ani.commons.objmeta.dto.meta.StateMachineDto;
import com.ani.commons.objmeta.dto.meta.StubDto;
import com.ani.commons.objmeta.dto.object.ObjectRegisterDto;
import com.ani.commons.objmeta.dto.object.ObjectUpdateDto;
import com.ani.commons.objmeta.object.AniObjectMaster;
import com.ani.commons.objmeta.object.ObjectType;

import java.util.List;

/**
 * Created by zhanglina on 18-3-29.
 */
public interface AniObjectMetaService {

    public void registerObjectMaster(ObjectRegisterDto registerDto);

    public void updateObjectMaster(ObjectUpdateDto updateDto);

    public AniObjectMaster getObjectMaster(long objectId);

    public List<AniObjectMaster> getObjectMasterByOwnerId(long accountId);

    public List<AniObjectMaster> getObjectMasterByOwnerIdAndType(long accountId, ObjectType type);

    public List<AniObjectMaster> getObjectMasterByDevAccountId(long accountId);

    public void bindAccount(Long objectId, Long accountId);

    public void releaseFromAccount(Long objectId);

    public void updateObjectStub(Long objectId, List<StubDto> stubs, boolean isFull);

    public void updateObjectState(Long objectId, List<StateMachineDto> states, boolean isFull);

}

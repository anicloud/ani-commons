package com.ani.commons.octopus.objmeta.service;

import com.ani.commons.octopus.objmeta.domain.ObjectMaster;
import com.ani.commons.octopus.objmeta.dto.meta.AniMetaDto;
import com.ani.commons.octopus.objmeta.dto.meta.StateMachineUpdateDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectInitDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterDto;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhanglina on 18-3-29.
 */
@Service
public interface AniObjectService {

    public ObjectInitDto registerObjectMaster(ObjectRegisterDto registerDto) throws AniRuleException, AniDataException;

//    public void updateObjectMasterMeta(ObjectMetaUpdateDto updateDto);

    public ObjectMaster getObjectMaster(Long objectId) throws AniRuleException, AniDataException;

    // TODO: 18-6-21 ObjectMaster batch querying in which returning brief meta
//    public List<ObjectMaster> getObjectsMasterByOwnerId(long ownerAccountId);

//    public List<ObjectMaster> getObjectsMasterByOwnerIdAndType(long ownerAccountId, ObjectType type);

//    public List<ObjectMaster> getObjectsMasterByDevAccountId(long accountId);

    public void bindAccount(Long objectId, Long accountId);

    public void releaseFromAccount(Long objectId);

    public void updateObjectStub(Long objectId, List<AniMetaDto> stubs, boolean isFull);

    public void updateObjectStateMachines(Long objectId, List<StateMachineUpdateDto> stateMachine, boolean isFull);

}

package com.ani.commons.octopus.objmeta.service;

import com.ani.commons.octopus.objmeta.domain.ObjectMaster;
import com.ani.commons.octopus.objmeta.dto.meta.AniMetaDto;
import com.ani.commons.octopus.objmeta.dto.meta.StateMachineUpdateDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectInitDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectMasterBriefInfoDto;
import com.ani.commons.octopus.objmeta.dto.object.ObjectQueryDto;
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

    /**
     * <h2>Register ObjectMaster</h2>
     *
     * @param registerDto <p>
     *                    ObjectRegisterForOrgDto: Organization ObjectMaster<br/>
     *                    ObjectRegisterForPersonalDto: Personal ObjectMaster
     *                    </p>
     * @return
     * @throws AniRuleException
     * @throws AniDataException
     */
    public ObjectInitDto registerObjectMaster(ObjectRegisterDto registerDto) throws AniRuleException, AniDataException;

//    public void updateObjectMasterMeta(ObjectMetaUpdateDto updateDto);

    /**
     * Query ObjectMaster by objectId.
     *
     * @param objectId
     * @return ObjectMaster
     * @throws AniRuleException
     * @throws AniDataException
     */
    public ObjectMaster getObjectMaster(Long objectId) throws AniRuleException, AniDataException;

    // TODO: 18-6-21 ObjectMaster batch querying in which returning brief meta

    /**
     * Batch get ObjectMaster by ownerId
     *
     * @param queryDto
     * <ul>
     *     <li>ObjectQueryOwnerDto: by ownerAccountId</li>
     *     <li>ObjectQuerySimpleDto: by objectId</li>
     * </ul>
     * @return Collection of ObjectMasterBriefInfoDto; Null if no result found.
     */
    public List<ObjectMasterBriefInfoDto> getObjectsMasterByQuery(ObjectQueryDto queryDto) throws AniRuleException, AniDataException;

    public void bindAccount(Long objectId, Long accountId);

    public void releaseFromAccount(Long objectId);

    public void updateObjectStub(Long objectId, List<AniMetaDto> stubs, boolean isFull);

    public void updateObjectStateMachines(Long objectId, List<StateMachineUpdateDto> stateMachine, boolean isFull);

}

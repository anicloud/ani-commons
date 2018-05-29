package com.ani.commons.octopus.objmeta.service;

import com.ani.commons.earth.dto.auth.AniAccountPrivilegeDto;
import com.ani.commons.octopus.objmeta.domain.ObjectModel;
import com.ani.commons.octopus.objmeta.dto.meta.StateMachineMetaDto;
import com.ani.commons.octopus.objmeta.dto.meta.StateMachineUpdateDto;
import com.ani.commons.octopus.objmeta.dto.meta.StubUpdateDto;
import com.ani.commons.octopus.objmeta.dto.model.*;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

/**
 * Created by zhanglina on 18-3-29.
 */
public interface AniObjectModelService {

    /**
     * <h2>Check model accessibility by privilege.</h2>
     * @param modelId
     * @param accountPrivilege
     * @throws AniRuleException
     */
    public void checkPrivilege(Long modelId, AniAccountPrivilegeDto accountPrivilege) throws AniRuleException, AniDataException;

    /**
     * <h2>Register model for one account with UNIQUE NAME</h2>
     *
     * @param objModelApplyDto
     * @return ModelInitDto <p>with modelId(unique globally), token and confirmed name.</p>
     */
    public ModelInitDto registerModel(ModelRegisterDto objModelApplyDto) throws AniRuleException, AniDataException;

    /**
     * <h2>Check model token legality</h2>
     *
     * @param modelId
     * @param modelToken
     */
    public void checkToken(long modelId, byte[] modelToken) throws AniAuthException, AniRuleException;

    /**
     * <h2>Batch update object model meta info</h2>
     *
     * @param modelUpdateDto
     */
    public void updateModelMeta(ModelUpdateDto modelUpdateDto) throws AniRuleException, AniDataException;

    /**
     * <h2>Batch update object model state</h2>
     *
     * @param modelStateUpdateDto
     */
    public void updateModelState(ModelStateUpdateDto modelStateUpdateDto) throws AniRuleException, AniDataException;

    /**
     * <h2>Batch update models stubs mapping</h2>
     *
     * @param stubsUpdateDto
     */
    public void updateModelStubs(ModelStubUpdateDto stubsUpdateDto) throws AniRuleException, AniDataException;

    /**
     * <h2>Batch create models STATE MACHINEs (sm) and states mapping of each sm.</h2>
     *
     * @param modelId
     * @param smsMetaDto
     */
    public void createModelStateMachines(Long modelId, List<StateMachineMetaDto> smsMetaDto) throws AniRuleException, AniDataException;

    /**
     * <h2>Update models STATE MACHINE (sm) and states mapping of sm.</h2>
     *
     * @param modelId
     * @param smUpdateDto
     */
    public void updateModelStateMachine(Long modelId, StateMachineUpdateDto smUpdateDto) throws AniRuleException, AniDataException;

    /**
     * <h2>Get models under specific account of developer by unique devAccountId.</h2>
     *
     * @param reqAccountId
     * @param devAccountId
     * @return <p>Multi ModelInfoDto if the account has models.</p>
     */
    public List<ModelBriefInfoDto> getModelByDevAccountId(Long reqAccountId, Long devAccountId) throws AniRuleException, AniDataException;

    /**
     * <h2>Get specific model if the privilege settings allowed.</h2>
     *
     * @param query by modelId with accountId confirmation;
     * @return <p>ModelInfoDto if the id exist and current account has privacy to access.</p>
     */
    public ObjectModel getAccessibleModelById(ModelQueryDto query) throws AniRuleException, AniDataException;

    /**
     * <h2>add models to org</h2>
     * @param orgModelRegDto
     * @return void
     *
     */
    public void addModelToOrg(OrgModelRegDto orgModelRegDto)throws AniRuleException,AniAuthException;

    /**
     * <h2>update node models </h2>
     * @param orgNodeModelMappingDto
     * @return void
     *
     */
    public void updateNodeModel(OrgNodeModelMappingDto orgNodeModelMappingDto) throws AniRuleException;
    /**
     * <h2>remove models by org</h2>
     * @param orgModelQuery
     * @return void
     *
     */
    public void removeOrgModel(OrgModelQueryDto orgModelQuery) throws AniRuleException,AniAuthException;

    /**
     * <h2>Get models by organization node</h2>
     * @param orgModelQuery query by orgId and nodeId
     * @return ModelInfoDto if the org node has models
     *
     */
    public List<ModelBriefInfoDto> getModelByOrgAndNodeId(OrgNodeModelQueryDto orgNodeModelQuery) throws AniRuleException;

    /**
     * <h2>Get models by organization node</h2>
     * @Param query by orgId
     * @return ModelInfoDto if the org has models
     *
     */
    public List<ModelBriefInfoDto> getModeByOrgId(OrgModelQueryDto orgModelQuery) throws AniRuleException;

}

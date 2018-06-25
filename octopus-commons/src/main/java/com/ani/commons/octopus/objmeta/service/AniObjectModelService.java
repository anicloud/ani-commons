package com.ani.commons.octopus.objmeta.service;

import com.ani.commons.earth.dto.auth.AniAccountPrivilegeDto;
import com.ani.commons.octopus.objmeta.domain.ObjectModel;
import com.ani.commons.octopus.objmeta.dto.meta.StateMachineMetaDto;
import com.ani.commons.octopus.objmeta.dto.meta.StateMachineUpdateDto;
import com.ani.commons.octopus.objmeta.dto.model.*;
import com.ani.utils.core.data.type.PrivilegeType;
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
     *
     * @param modelId target model id
     * @param requestAccountId
     * @param privilege privilege type requested
     * @throws AniRuleException
     */
    public void checkPrivilege(Long modelId, Long requestAccountId, PrivilegeType privilege) throws AniRuleException, AniDataException;


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
     * <p>Update model meta by the rule defined by Operation Type:</p>
     * <p>If update-part or save, all the NULL props will be skipped</p>
     * <p>If update-full or remove, all the NULL props will be override by NULL.</p>
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
     * <h2>Update model privacy type by modelId<h2/>
     *
     * @param modelPrivacyUpdateDto
     * @throws AniRuleException
     */
    public void updateModelPrivacy(ModelPrivacyUpdateDto modelPrivacyUpdateDto) throws AniRuleException, AniDataException;

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
     * @param reqAccountId
     * @param smsMetaDto
     */
    public void createModelStateMachines(Long modelId, Long reqAccountId, List<StateMachineMetaDto> smsMetaDto) throws AniRuleException, AniDataException;

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
    public List<ModelBriefInfoDto> getModelsByDevAccountId(Long reqAccountId, Long devAccountId) throws AniRuleException, AniDataException;

    /**
     * Get object model by objectId
     *
     * @param modelId model unique id
     * @return ObjectModel domain
     * @throws AniRuleException
     * @throws AniDataException if data system error
     */
    public ObjectModel getModelById(Long modelId) throws AniRuleException, AniDataException;

    /**
     * <h2>Get specific model if the privilege strategies allowed.</h2>
     *
     * @param query by modelId with accountId confirmation;
     * @return <p>ModelInfoDto if the id exist and current account has privacy to access.</p>
     */
    public ObjectModel getAccessibleModelById(ModelQueryDto query) throws AniRuleException, AniDataException;

    /**
     * <h2>add models to org</h2>
     *
     * @param orgModelRegDto
     * @return void
     *
     */
    public void addModelToOrg(OrgModelRegDto orgModelRegDto)throws AniRuleException,AniAuthException;

    /**
     * <h2>update node models </h2>
     *
     * @param orgNodeModelMappingDto
     * @return void
     *
     */
    public void updateNodeModel(OrgNodeModelMappingDto orgNodeModelMappingDto) throws AniRuleException;

    /**
     * <h2>remove models by org</h2>
     *
     * @param orgModelQuery
     * @return void
     *
     */
    public void removeOrgModel(OrgModelQueryDto orgModelQuery) throws AniRuleException,AniAuthException;

    /**
     * <h2>Get models by ORGANIZATION node</h2>
     *
     * @param orgNodeModelQuery query by orgId and nodeId
     * @return ModelInfoDto if the org node has models
     *
     */

    public List<ModelBriefInfoDto> getModelByOrgAndNodeId(OrgNodeModelQueryDto orgNodeModelQuery) throws AniRuleException;

    /**
     * <h2>Get models by ORGANIZATION node</h2>
     *
     * @param orgModelQuery by orgId
     * @return ModelInfoDto if the org has models
     *
     */
    public List<ModelBriefInfoDto> getModelByOrgId(OrgModelQueryDto orgModelQuery) throws AniRuleException;

    /**
     * <h2>Check org object model accessibility</h2>
     *
     * @param orgModelAccessCheckDto
     * @return
     *
     */
    public void checkOrgModelAccess(OrgModelAccessCheckDto orgModelAccessCheckDto) throws AniRuleException;


}

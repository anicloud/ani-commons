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
     * @param smsMetaDto
     */
    public void createModelStateMachines(List<StateMachineMetaDto> smsMetaDto) throws AniRuleException, AniDataException;

    /**
     * <h2>Update models STATE MACHINE (sm) and states mapping of sm.</h2>
     *
     * @param smUpdateDto
     */
    public void updateModelStateMachine(StateMachineUpdateDto smUpdateDto) throws AniRuleException, AniDataException;

    /**
     * <h2>Get models under specific account of developer by unique devAccountId.</h2>
     *
     * @param accountId
     * @return <p>Multi ModelInfoDto if the account has models.</p>
     */
    public List<ModelBriefInfoDto> getModelByDevAccountId(Long accountId) throws AniRuleException, AniDataException;

    /**
     * <h2>Get specific model if the privilege settings allowed.</h2>
     *
     * @param query by modelId with accountId confirmation;
     * @return <p>ModelInfoDto if the id exist and current account has privacy to access.</p>
     */
    public ObjectModel getAccessibleModelById(ModelQueryDto query) throws AniRuleException, AniDataException;

}

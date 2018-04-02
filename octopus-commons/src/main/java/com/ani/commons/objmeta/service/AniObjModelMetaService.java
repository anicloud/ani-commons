package com.ani.commons.objmeta.service;

import com.ani.commons.objmeta.dto.model.AniObjModelDto;
import com.ani.commons.objmeta.object.ObjectModel;
import com.ani.commons.objmeta.object.state.StateMachine;
import com.ani.commons.objmeta.object.stub.StubMapper;

import java.util.List;
import java.util.Set;

/**
 * Created by zhanglina on 18-3-29.
 */
public interface AniObjModelMetaService {

    public void saveModel(AniObjModelDto objModelDto);

    public void batchRemoveModel(Set<Long> objModelsId);

    public void removeModelByDevAccountId(Long accountId);

    public void updateModel(AniObjModelDto objModelDto);

    public List<ObjectModel> getModelByDevAccountId(Long accountId);

    public ObjectModel getModelById(Long modelId);

    public void updateModelStub(Long modelId, List<StubMapper> stubs, boolean isFull);

    public void updateModelState(Long modelId, List<StateMachine> states, boolean isFull);

}

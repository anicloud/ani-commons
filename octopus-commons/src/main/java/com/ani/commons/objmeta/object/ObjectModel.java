package com.ani.commons.objmeta.object;

  import com.ani.commons.objmeta.object.state.StateMachine;
import com.ani.commons.objmeta.object.stub.StubMapper;
import com.ani.utils.core.AniByte;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ObjectModel extends AniObjectMeta {

    private static final long serialVersionUID = -7225989167187564700L;
    private Long modelId;
    private String name;
    private AniByte token;
    private ObjectType objectType;
    private Long devAccountId;

    public ObjectModel() {
    }

    public ObjectModel(Collection<StubMapper> stubs, List<StateMachine> stateMachines, Long modelId, String name, AniByte token, ObjectType objectType, Long devAccountId) {
        super(stubs, stateMachines);
        this.modelId = modelId;
        this.name = name;
        this.token = token;
        this.objectType = objectType;
        this.devAccountId = devAccountId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AniByte getToken() {
        return token;
    }

    public void setToken(AniByte token) {
        this.token = token;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public Long getDevAccountId() {
        return devAccountId;
    }

    public void setDevAccountId(Long devAccountId) {
        this.devAccountId = devAccountId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.modelId);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ObjectModel))
            return false;
        ObjectModel objModel = (ObjectModel) obj;
        return this.modelId == objModel.modelId;
    }
}

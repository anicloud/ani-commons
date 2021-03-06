package com.ani.commons.octopus.objmeta.domain;

import com.ani.commons.octopus.objmeta.domain.state.StateMachineMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubMeta;
import com.ani.utils.core.AniByte;
import com.ani.utils.core.data.type.ConnState;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class ObjectMaster extends AniObject {

    private static final long serialVersionUID = -7713960489119720503L;

    private Long objectId;
    private Long ownerAccountId;
    private Map<AniByte, ConnState> antennasState;

    public ObjectMaster() {
        super();
    }

    public ObjectMaster(String name, Collection<StubMeta> stubs, List<StateMachineMeta> stateMachines, ObjectModel model, Long objectId, Long ownerAccountId, Map<AniByte, ConnState> antennasState) {
        super(name, stubs, stateMachines, model);
        this.objectId = objectId;
        this.ownerAccountId = ownerAccountId;
        this.antennasState = antennasState;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    public Map<AniByte, ConnState> getAntennasState() {
        return antennasState;
    }

    public void setAntennasState(Map<AniByte, ConnState> antennasState) {
        this.antennasState = antennasState;
    }

}

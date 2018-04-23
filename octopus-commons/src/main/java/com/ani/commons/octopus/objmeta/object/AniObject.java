package com.ani.commons.octopus.objmeta.object;

import com.ani.commons.octopus.objmeta.object.state.StateMachine;
import com.ani.commons.octopus.objmeta.object.stub.StubMapper;

public abstract class AniObject extends AniObjectMeta {

    private static final long serialVersionUID = 6043513124571055276L;

    private ObjectModel model;

    @Override
    public StubMapper getStub(int groupId, int metaId) {
        StubMapper oneStub = null;
        oneStub = super.getStub(groupId, metaId);
        if (oneStub == null)
            oneStub = getModelStub(groupId, metaId);
        return oneStub;
    }

    private StubMapper getModelStub(int groupId, int metaId) {
        if (this.model == null) return null;
        return this.model.getStub(groupId, metaId);
    }

    @Override
    public StateMachine getStateMachineByIdx(int idx) {
        StateMachine oneSm;
        oneSm = getModelStateMachine(idx);
        if (oneSm == null)
            oneSm = super.getStateMachineByIdx(idx);
        return oneSm;
    }

    private StateMachine getModelStateMachine(int idx) {
        if (this.model == null) return null;
        return this.model.getStateMachineByIdx(idx);
    }
}

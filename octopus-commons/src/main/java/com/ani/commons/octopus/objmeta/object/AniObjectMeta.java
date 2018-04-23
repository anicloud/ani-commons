package com.ani.commons.octopus.objmeta.object;

import com.ani.commons.octopus.objmeta.object.state.StateMachine;
import com.ani.commons.octopus.objmeta.object.stub.StubMapper;
import com.ani.utils.core.data.meta.AniMeta;
import com.ani.utils.exception.AniRuleException;

import java.io.Serializable;
import java.util.*;

public abstract class AniObjectMeta implements Serializable {

    private static final long serialVersionUID = 6134988385184636975L;

    private String name;
    private Map<Long, StubMapper> stubs;
    private List<StateMachine> stateMachines;

    public AniObjectMeta() {
    }

    protected AniObjectMeta(Collection<StubMapper> stubs, List<StateMachine> stateMachines) {
        this.setStubs(stubs, true);
        this.setStateMachines(stateMachines, true);
    }

    public List<StubMapper> getStubs() {
        return new ArrayList<>(stubs.values());
    }

    public StubMapper getStub(int groupId, int metaId) {
        StubMapper stubs = null;
        try {
            stubs = this.stubs.get(
                    AniMeta.getLongId(groupId, metaId));
        } catch (AniRuleException e) {
            return null;
        }
        if (stubs == null)
            return null;
        return stubs;
    }

    public void setStubs(Collection<StubMapper> stubs, boolean isFull) {
        if (stubs == null || stubs.size() < 1) return;
        int finalSize = stubs.size();
        HashMap<Long, StubMapper> newStubs = null;
        if (!isFull) {
            finalSize += this.stubs.size();
            newStubs = new HashMap<>(finalSize);
            newStubs.putAll(this.stubs);
        } else {
            newStubs = new HashMap<>(finalSize);
        }
        putStubsMapFromCollection(
                newStubs,
                stubs);
        this.stubs = newStubs;
    }

    private void putStubsMapFromCollection(HashMap<Long, StubMapper> target, Collection<StubMapper> stubs) {
        if (target == null) return;
        if (stubs == null || stubs.size() < 1) return;
        for (StubMapper oneStub : stubs) {
            long longId = -1;
            try {
                oneStub.getLongId();
            } catch (AniRuleException e) {
                continue;
            }
            target.put(longId, oneStub);
        }
    }

    public List<StateMachine> getStateMachines() {
        return stateMachines;
    }

    public StateMachine getStateMachineByIdx(int idx){
        if (this.stubs == null || idx < 0 || idx > this.stubs.size())
            return null;
        return stateMachines.get(idx);
    }

    public void setStateMachines(List<StateMachine> stateMachines, boolean isFull) {
        this.stateMachines = stateMachines;
    }
}

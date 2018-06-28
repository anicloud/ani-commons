package com.ani.commons.octopus.objmeta.domain;

import com.ani.commons.octopus.objmeta.domain.state.StateMachineMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubMeta;
import com.ani.utils.core.data.meta.AniMeta;
import com.ani.utils.exception.AniRuleException;

import java.io.Serializable;
import java.util.*;

public abstract class AniBaseObject implements Serializable {

    private static final long serialVersionUID = 6134988385184636975L;

    private String name;
    private Map<Long, StubMeta> stubsMeta;
    private List<StateMachineMeta> stateMachinesMeta;

    public AniBaseObject() {
    }

    protected AniBaseObject(String name, Collection<StubMeta> stubsMeta, List<StateMachineMeta> stateMachinesMeta) {
        this.name = name;
        this.setStubs(stubsMeta, true);
        this.setStateMachines(stateMachinesMeta, true);
    }

//    public List<StubMeta> getStubsMeta() {
//        return new ArrayList<>(stubsMeta.values());
//    }
//    public List getStubs


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Long, StubMeta> getStubsMeta() {
        return stubsMeta;
    }

    public void setStubsMeta(Map<Long, StubMeta> stubsMeta) {
        this.stubsMeta = stubsMeta;
    }

    public StubMeta getStub(int groupId, int metaId) {
        StubMeta stubs = null;
        try {
            stubs = this.stubsMeta.get(
                    AniMeta.getLongId(groupId, metaId));
        } catch (AniRuleException e) {
            return null;
        }
        if (stubs == null)
            return null;
        return stubs;
    }

    public void setStubs(Collection<StubMeta> stubs, boolean isFull) {
        if (stubs == null || stubs.size() < 1) return;
        int finalSize = stubs.size();
        HashMap<Long, StubMeta> newStubs = null;
        if (!isFull) {
            finalSize += this.stubsMeta.size();
            newStubs = new HashMap<>(finalSize);
            newStubs.putAll(this.stubsMeta);
        } else {
            newStubs = new HashMap<>(finalSize);
        }
        putStubsMapFromCollection(
                newStubs,
                stubs);
        this.stubsMeta = newStubs;
    }

    private void putStubsMapFromCollection(HashMap<Long, StubMeta> target, Collection<StubMeta> stubs) {
        if (target == null) return;
        if (stubs == null || stubs.size() < 1) return;
        for (StubMeta oneStub : stubs) {
            long longId = -1;
            try {
                oneStub.getLongId();
            } catch (AniRuleException e) {
                continue;
            }
            target.put(longId, oneStub);
        }
    }

    public List<StateMachineMeta> getStateMachinesMeta() {
        return stateMachinesMeta;
    }

    protected StateMachineMeta getStateMachineByIdx(int idx) throws AniRuleException {
        if (this.stubsMeta == null || idx < 0 || idx > this.stubsMeta.size())
            return null;
        return stateMachinesMeta.get(idx);
    }

    protected void setStateMachines(List<StateMachineMeta> stateMachines, boolean isFull) {
        this.stateMachinesMeta = stateMachines;
    }
}

package com.ani.commons.octopus.objmeta.domain;

import com.ani.commons.octopus.objmeta.domain.state.StateMachine;
import com.ani.commons.octopus.objmeta.domain.state.StateMachineMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubMeta;
import com.ani.utils.exception.AniRuleException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AniObject extends AniBaseObject {

    private static final long serialVersionUID = 6043513124571055276L;

    private ObjectModel model;
    private List<StateMachine> stateMachines;

    public AniObject() {
    }

    public AniObject(Collection<StubMeta> stubs, List<StateMachineMeta> stateMachines, ObjectModel model) {
        super(stubs, stateMachines);
        this.model = model;
    }

    @Override
    public StubMeta getStub(int groupId, int metaId) {
        StubMeta oneStub = null;
        oneStub = getModelStub(groupId, metaId);
        if (oneStub == null)
            oneStub = super.getStub(groupId, metaId);
        return oneStub;
    }

    public List<StateMachine> getStateMachines() {
        return stateMachines;
    }

    public void setStateMachines(List<StateMachine> stateMachines) {
        this.stateMachines = stateMachines;
    }

    private StubMeta getModelStub(int groupId, int metaId) {
        if (this.model == null) return null;
        return this.model.getStub(groupId, metaId);
    }

    @Override
    public StateMachineMeta getStateMachineByIdx(int idx) throws AniRuleException {
        StateMachineMeta oneSm;
        oneSm = getModelStateMachine(idx);
        if (oneSm != null)
            return oneSm;
        Integer localIdx = getObjLocalStateMachineIdx(idx);
        return super.getStateMachineByIdx(localIdx);
    }

    public ObjectModel getModel() {
        return model;
    }

    public void setModel(ObjectModel model) {
        this.model = model;
    }

    private void initSMsFromMeta(List<StateMachineMeta> smsMeta) throws AniRuleException {
        if (smsMeta == null)
            throw new AniRuleException("STATE_MACHINES_META_REQUIRED");
        List<StateMachine> sms = new ArrayList<>(smsMeta.size());
        for (int i = 0; i < smsMeta.size(); i++) {
            StateMachineMeta curSmMeta = smsMeta.get(i);
            if (curSmMeta == null) continue;
            sms.add(new StateMachine(curSmMeta, null));
            // TODO: 18-5-5
        }
    }

    private Integer getObjLocalStateMachineIdx(int idx) throws AniRuleException {
        if (this.model == null
                || this.model.getStateMachinesMeta() == null
                || this.model.getStateMachinesMeta().size() < 1)
            return idx;
        List<StateMachineMeta> modelSms = this.model.getStateMachinesMeta();
        int localIdx = idx - modelSms.size();
        if (localIdx < 0
                || super.getStateMachinesMeta() == null
                || localIdx >= super.getStateMachinesMeta().size())
            throw new AniRuleException("IDX_VALUE_OVERFLOW");
        return localIdx;
    }

    private StateMachineMeta getModelStateMachine(int idx) throws AniRuleException {
        if (this.model == null) return null;
        return this.model.getStateMachineByIdx(idx);
    }
}

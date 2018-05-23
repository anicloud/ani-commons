package com.ani.commons.octopus.objmeta.domain.state;

import com.ani.utils.core.data.value.AniValue;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class StateMachine implements Serializable {

    private static final long serialVersionUID = -715424544923727403L;

    private StateMachineMeta smMeta;
    private Map<Long, StateValue> values;
    private StateValue curState;

    public StateMachine() {
    }

    public StateMachine(StateMachineMeta smMeta, StateValue curState) throws AniRuleException {
        this.setSmMeta(smMeta);
        this.curState = curState;
    }

    public StateMachineMeta getSmMeta() {
        return smMeta;
    }

    public void setSmMeta(StateMachineMeta smMeta) throws AniRuleException {
        if(smMeta == null)
            throw new AniRuleException("STATE_MACHINE_REQUIRED");
        this.smMeta = smMeta;
        initValuesFromSM(this.smMeta);
    }

    private void initValuesFromSM(StateMachineMeta smMeta) throws AniRuleException {
        if(smMeta == null)
            throw new AniRuleException("STATE_MACHINE_REQUIRED");
        if(smMeta.getStates() == null)
            return;
        this.values = new HashMap<>(smMeta.getStates().size());
    }

    public StateValue getStateValue(Long metaLongId) throws AniRuleException, AniDataException {
        if(metaLongId == null)
            throw new AniRuleException("META_LONG_ID_REQUIRED");
        StateValue value = this.values.get(metaLongId);
        if(value == null) throw new AniDataException("STATE_VALUE_NOT_EXIST");
        return value;
    }

    public Map<Long, StateValue> getValues() {
        return values;
    }

    public void setStateValue(StateValue value) throws AniRuleException, AniValue.AniValueException {
        checkStateExistence(curState);
        curState.check();
        this.values.put(value.getMeta().getLongId(), value);
    }

    public StateValue getCurState() {
        return curState;
    }

    public void setCurState(StateValue curState) throws AniRuleException, AniValue.AniValueException {
        if(curState == null) {
            this.curState = null;
            return;
        }
        setStateValue(curState);
        this.curState = curState;
    }

    private void checkStateExistence(StateValue curState) throws AniRuleException {
        if(curState == null)
            return;
        if(this.smMeta == null
                || !values.containsKey(curState.getMeta().getLongId()))
            throw new AniRuleException("STATE_NOT_EXIST");
    }
}
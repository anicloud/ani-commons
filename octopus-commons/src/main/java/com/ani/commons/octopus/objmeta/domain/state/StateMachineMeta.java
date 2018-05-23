package com.ani.commons.octopus.objmeta.domain.state;

import com.ani.utils.core.data.meta.AniMeta;
import com.ani.utils.core.data.value.AniValue;
import com.ani.utils.exception.AniRuleException;

import java.io.Serializable;
import java.util.*;

public class StateMachineMeta implements Serializable {

    private static final long serialVersionUID = -6065371041043101316L;

    private String name;
    private Map<Long, StateMeta> states;
    private StateMeta curState;

    public StateMachineMeta() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StateMeta> getStates() {
        return getStatesList();
    }

    public void addStates(Set<StateMeta> states) throws AniRuleException {
        setStatesFromSet(states, false);
    }

    private List<StateMeta> getStatesList() {
        return new ArrayList<StateMeta>(this.states.values());
    }

    public void checkStateValue(StateValue value) throws AniRuleException, AniValue.AniValueException {
        if(value == null)
            throw new AniRuleException("STATE_VALUE_REQUIRED");
        if(value.getMeta() == null)
            throw new AniRuleException("VALUE_META_REQUIRED");
        checkMetaExistence((StateMeta)value.getMeta());
        value.check();
    }

    private void checkMetaExistence(StateMeta state) throws AniRuleException {
        if(state == null || state.getLongId() == null)
            throw new AniRuleException("ILLEGAL_STATE_META");
        if(this.states == null || this.states.containsValue(state))
            throw new AniRuleException("STATE_NOT_EXIST");
    }

    public void initStates(Set<StateMeta> states) throws AniRuleException {
        setStatesFromSet(states, true);
    }

    public void initStates(Map<Long, StateMeta> statesLongIdMap) {
        this.states = statesLongIdMap;
    }

    private void setStatesFromSet(Set<StateMeta> states, boolean reset) throws AniRuleException {
        if (states == null) {
            throw new AniRuleException(Errors.STATES_REQUIRED.name());
        }
        constructStates(states.size(), reset);
        for (StateMeta oneState : states) {
            this.states.put(oneState.getLongId(), oneState);
        }
    }

    private void constructStates(Integer length, boolean reset) {
        if (length == null || length < 1) length = 1;
        if (reset || this.states == null || this.states.size() < 1) {
            this.states = new HashMap<>(length, 1f);
            return;
        }
        int finalLength = this.states.size() + length;
        Map<Long, StateMeta> finalStates = new HashMap<>(finalLength, 1f);
        finalStates.putAll(this.states);
        this.states = finalStates;
    }

    public enum Errors {
        NOT_INITIALIZED,
        STATE_NOT_EXIST,
        STATES_REQUIRED
    }
}

package com.ani.commons.objmeta.object.state;

import com.ani.utils.exception.AniRuleException;

import java.io.Serializable;
import java.util.*;

public class StateMachine implements Serializable {

    private static final long serialVersionUID = -6065371041043101316L;

    private String name;
    private Map<Long, StateMapper> states;
    private StateMapper curState;

    public StateMachine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StateMapper> getStates() {
        return getStatesList();
    }

    public void addStates(Set<StateMapper> states) throws AniRuleException {
        setStatesFromSet(states, false);
    }

    private List<StateMapper> getStatesList() {
        return new ArrayList<StateMapper>(this.states.values());
    }

    public StateMapper getCurState() throws AniRuleException {
        if (states != null && !states.containsValue(curState)) {
            this.curState = null;
            throw new AniRuleException(Errors.STATE_NOT_EXIST.name());
        }
        return curState;
    }

    public void setCurState(StateMapper curState) throws AniRuleException {
        resetCurState(curState);
    }

    public void initStates(Set<StateMapper> states) throws AniRuleException {
        setStatesFromSet(states, true);
    }

    private void setStatesFromSet(Set<StateMapper> states, boolean reset) throws AniRuleException {
        if (states == null) {
            throw new AniRuleException(Errors.STATES_REQUIRED.name());
        }
        constructStates(states.size(), reset);
        for (StateMapper oneState : states) {
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
        Map<Long, StateMapper> finalStates = new HashMap<>(finalLength, 1f);
        finalStates.putAll(this.states);
        this.states = finalStates;
    }

    private void resetCurState(StateMapper curState) throws AniRuleException {
        if (this.states == null) {
            throw new AniRuleException(Errors.NOT_INITIALIZED.name());
        }
        if (curState != null && !this.states.containsValue(curState)) {
            throw new AniRuleException(Errors.STATE_NOT_EXIST.name());
        }
        this.curState = this.states.put(curState.getLongId(), curState);
    }

    public enum Errors {
        NOT_INITIALIZED,
        STATE_NOT_EXIST,
        STATES_REQUIRED
    }
}

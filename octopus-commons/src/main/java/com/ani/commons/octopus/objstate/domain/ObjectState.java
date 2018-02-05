package com.ani.commons.octopus.objstate.domain;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by yeh on 17-3-17.
 */
public abstract class ObjectState implements Serializable {

    private Set<StateMachine> stateMachines;

    public ObjectState() {
    }

    public ObjectState(Set<StateMachine> stateMachines) {
        this.stateMachines = stateMachines;
    }

    public Set<StateMachine> getStateMachines() {
        return stateMachines;
    }

    public void setStateMachines(Set<StateMachine> stateMachines) {
        this.stateMachines = stateMachines;
    }
}

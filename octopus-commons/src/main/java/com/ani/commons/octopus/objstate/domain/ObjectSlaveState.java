package com.ani.commons.octopus.objstate.domain;

import com.ani.commons.octopus.object.enumeration.ConnState;

import java.util.Set;

/**
 * Created by yeh on 17-3-17.
 */
public class ObjectSlaveState extends ObjectState {

    public ConnState connState;

    public ObjectSlaveState() {
        super();
    }

    public ObjectSlaveState(Set<StateMachine> stateMachines, ConnState connState) {
        super(stateMachines);
        this.connState = connState;
    }
}

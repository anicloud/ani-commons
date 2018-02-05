package com.ani.commons.octopus.objstate.domain;

import com.ani.commons.octopus.object.enumeration.ConnState;
import com.ani.utils.core.AniByte;

import java.util.Map;
import java.util.Set;

/**
 * Created by yeh on 17-3-17.
 */
public class ObjectMainState extends ObjectState {

    public Map<AniByte, ConnState> hostsConnState;

    public ObjectMainState(){
        super();
    }

    public ObjectMainState(Set<StateMachine> stateMachines, Map<AniByte, ConnState> hostsConnState) {
        super(stateMachines);
        this.hostsConnState = hostsConnState;
    }
}

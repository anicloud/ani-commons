package com.ani.commons.octopus.object.state;

import java.io.Serializable;
import java.util.Set;

public class StateMachineMeta implements Serializable {

    private static final long serialVersionUID = 1211182828105417216L;

    String name;

    Set<StateMeta> states;

    public StateMachineMeta() {
    }

    public StateMachineMeta(String name, Set<StateMeta> states) {
        this.name = name;
        this.states = states;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<StateMeta> getStates() {
        return states;
    }

    public void setStates(Set<StateMeta> states) {
        this.states = states;
    }
}

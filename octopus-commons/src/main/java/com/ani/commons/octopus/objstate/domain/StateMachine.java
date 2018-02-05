package com.ani.commons.octopus.objstate.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yeh on 17-3-17.
 */
public class StateMachine implements Serializable {

    private static final long serialVersionUID = -6974623553789444234L;
    private Integer smId;

    private List<StateNode> nodes;

    public StateMachine() {
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        return (obj.hashCode() == this.hashCode());
    }

    public int hashCode() {
        if (smId == null) return -1;
        return smId;
    }

}

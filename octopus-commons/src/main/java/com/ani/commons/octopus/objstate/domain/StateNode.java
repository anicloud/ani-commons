package com.ani.commons.octopus.objstate.domain;

import com.ani.commons.octopus.objmeta.state.domain.AniState;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yeh on 17-3-17.
 */
public class StateNode implements Serializable {

    private AniState state;

    private List<Object> argsValue;

    public StateNode() {
    }

    public StateNode(AniState state, List<Object> argsValue) {
        this.state = state;
        this.argsValue = argsValue;
    }

    public AniState getState() {
        return state;
    }

    public void setState(AniState state) {
        this.state = state;
    }

    public List<Object> getArgsValue() {
        return argsValue;
    }

    public void setArgsValue(List<Object> argsValue) {
        this.argsValue = argsValue;
    }
}

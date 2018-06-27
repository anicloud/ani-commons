package com.ani.commons.octopus.objmeta.domain;

import com.ani.commons.octopus.objmeta.domain.state.StateMachineMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubMeta;
import com.ani.utils.core.data.type.ConnState;

import java.util.Collection;
import java.util.List;

public class ObjectSlave extends AniObject {

    private static final long serialVersionUID = -7713960489119720503L;

    private Integer slaveId;
    private ObjectMaster master;
    private ConnState connState;

    public ObjectSlave() {}

    public ObjectSlave(String name, Collection<StubMeta> stubs, List<StateMachineMeta> stateMachines, ObjectModel model, Integer slaveId, ObjectMaster master, ConnState connState) {
        super(name, stubs, stateMachines, model);
        this.slaveId = slaveId;
        this.master = master;
        this.connState = connState;
    }

    public Integer getSlaveId() {
        return slaveId;
    }

    public void setSlaveId(Integer slaveId) {
        this.slaveId = slaveId;
    }

    public ObjectMaster getMaster() {
        return master;
    }

    public void setMaster(ObjectMaster master) {
        this.master = master;
    }

    public ConnState getConnState() {
        return connState;
    }

    public void setConnState(ConnState connState) {
        this.connState = connState;
    }
}

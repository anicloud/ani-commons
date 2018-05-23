package com.ani.commons.octopus.objmeta.domain;

import com.ani.utils.core.data.type.ConnState;

public class AniObjectSlave extends AniObject {

    private static final long serialVersionUID = -7713960489119720503L;

    private Integer slaveId;
    private AniObjectMaster master;
    private ConnState connState;

    public AniObjectSlave() {}

    public AniObjectSlave(Integer slaveId, AniObjectMaster master, ConnState connState) {
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

    public AniObjectMaster getMaster() {
        return master;
    }

    public void setMaster(AniObjectMaster master) {
        this.master = master;
    }

    public ConnState getConnState() {
        return connState;
    }

    public void setConnState(ConnState connState) {
        this.connState = connState;
    }
}

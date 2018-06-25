package com.ani.commons.octopus.objmeta.domain;

import com.ani.commons.octopus.objmeta.domain.state.StateMachineMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubMeta;
import com.ani.utils.core.AniByte;
import com.ani.utils.core.data.type.ConnState;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ObjectMasterPersonal extends ObjectMaster {

    private static final long serialVersionUID = 7713960489119720503L;

    public ObjectMasterPersonal() {
    }

    public ObjectMasterPersonal(Collection<StubMeta> stubs, List<StateMachineMeta> stateMachines, ObjectModel model, Long objectId, Long ownerAccountId, Map<AniByte, ConnState> antennasState) {
        super(stubs, stateMachines, model, objectId, ownerAccountId, antennasState);
    }
}

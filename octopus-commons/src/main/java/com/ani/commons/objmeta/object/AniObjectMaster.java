package com.ani.commons.objmeta.object;

import com.ani.utils.core.AniByte;
import com.ani.utils.core.data.type.ConnState;

import java.util.Map;

public class AniObjectMaster extends AniObject {

    private static final long serialVersionUID = -7713960489119720503L;

    private Long ownerAccountId;
    private Map<AniByte, ConnState> antennasState;

    public Long getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    public Map<AniByte, ConnState> getAntennasState() {
        return antennasState;
    }

    public void setAntennasState(Map<AniByte, ConnState> antennasState) {
        this.antennasState = antennasState;
    }
}

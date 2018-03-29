package com.ani.commons.octopus.object;

import com.ani.commons.octopus.object.stub.StubMapper;
import com.ani.utils.core.AniByte;
import com.ani.utils.core.data.meta.AniMeta;
import com.ani.utils.core.data.type.ConnState;
import com.ani.utils.exception.AniRuleException;

import java.util.Map;

public class AniObjectMaster extends AniObject {

    private static final long serialVersionUID = -7713960489119720503L;

    private Long ownerAccountId;
    private AniByte token;
    private Map<AniByte, ConnState> antennasState;


    public Long getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    public AniByte getToken() {
        return token;
    }

    public void setToken(AniByte token) {
        this.token = token;
    }

    public Map<AniByte, ConnState> getAntennasState() {
        return antennasState;
    }

    public void setAntennasState(Map<AniByte, ConnState> antennasState) {
        this.antennasState = antennasState;
    }
}

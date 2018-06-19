package com.ani.commons.octopus.objmeta.domain.stub;

import com.ani.utils.core.data.meta.AniMeta;
import com.ani.utils.core.data.meta.AniMetaParam;
import com.ani.utils.core.data.type.ConnType;
import com.ani.utils.core.data.type.PrivilegeType;

import java.util.List;

public class StubMeta extends AniMeta {

    private static final long serialVersionUID = 3809966888882063667L;

    private ConnType connType;
    private PrivilegeType privilegeType;

    public StubMeta() {
    }

    public StubMeta(StubGroupMeta group, Integer id, String name, List<AniMetaParam> params, ConnType connType, PrivilegeType privilegeType) {
        super(group, id, name, params);
        this.connType = connType;
        this.privilegeType = privilegeType;
    }

    public ConnType getConnType() {
        return connType;
    }

    public void setConnType(ConnType connType) {
        this.connType = connType;
    }

    public PrivilegeType getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(PrivilegeType privilegeType) {
        this.privilegeType = privilegeType;
    }
}
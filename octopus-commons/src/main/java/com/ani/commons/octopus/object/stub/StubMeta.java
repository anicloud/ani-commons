package com.ani.commons.octopus.object.stub;

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

    public StubMeta(Integer groupId, Integer id, String name, List<AniMetaParam> params, ConnType connType, PrivilegeType privilegeType) {
        super(groupId, id, name, params);
        this.connType = connType;
        this.privilegeType = privilegeType;
    }
}

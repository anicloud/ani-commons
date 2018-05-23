package com.ani.commons.octopus.objmeta.domain.state;

import com.ani.utils.core.data.meta.AniMeta;
import com.ani.utils.core.data.meta.AniMetaParam;

import java.util.List;

public class StateMeta extends AniMeta {

    private static final long serialVersionUID = 3809966888882063667L;

    public StateMeta() {
    }

    public StateMeta(Integer groupId, Integer id, String name, List<AniMetaParam> params) {
        super(groupId, id, name, params);
    }
}

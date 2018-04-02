package com.ani.commons.objmeta.object.stub;

import com.ani.utils.core.data.meta.AniMetaMapper;

import java.io.Serializable;

public class StubMapper extends AniMetaMapper implements Serializable {

    private static final long serialVersionUID = 5838783966113662727L;

    public StubMapper() {
    }

    public StubMapper(Integer groupId, Integer id) {
        super(groupId, id);
    }
}

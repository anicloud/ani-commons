package com.ani.commons.octopus.objmeta.domain.stub;

import com.ani.utils.core.data.meta.AniMeta;
import com.ani.utils.core.data.meta.AniMetaValue;
import com.ani.utils.core.data.value.AniValue;

import java.util.List;
import java.util.Map;

public class StubValue extends AniMetaValue {

    public StubValue() {
    }

    public StubValue(AniMeta meta, List<AniValue> paramsValue) {
        super(meta, paramsValue);
    }
}
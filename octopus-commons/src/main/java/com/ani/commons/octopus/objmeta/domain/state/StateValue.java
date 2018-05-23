package com.ani.commons.octopus.objmeta.domain.state;

import com.ani.utils.core.data.meta.AniMeta;
import com.ani.utils.core.data.meta.AniMetaValue;
import com.ani.utils.core.data.value.AniValue;

import java.util.List;
import java.util.Map;

public class StateValue extends AniMetaValue {

    public StateValue() {
    }

    public StateValue(AniMeta stateMeta, List<AniValue> paramsValue) {
        super(stateMeta, paramsValue);
    }
}
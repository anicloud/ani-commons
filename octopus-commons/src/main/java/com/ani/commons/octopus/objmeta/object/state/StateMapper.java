package com.ani.commons.octopus.objmeta.object.state;

import com.ani.utils.core.data.meta.AniMetaMapper;
import com.ani.utils.core.data.value.AniValue;
import com.ani.utils.exception.AniRuleException;

import java.io.Serializable;
import java.util.List;

public class StateMapper extends AniMetaMapper implements Serializable {

    private static final long serialVersionUID = 5838783966113662727L;

    private List paramsValue;

    public StateMapper() {
    }

    public List getParamsValue() {
        return paramsValue;
    }

    public void setParamsValue(List paramsValue, StateMeta meta) throws AniRuleException, AniValue.AniValueException {
        checkParamsValue(paramsValue, meta);
        this.paramsValue = paramsValue;
    }

    private void checkParamsValue(List values, StateMeta meta) throws AniRuleException, AniValue.AniValueException {
        checkMetaMatching(meta);
        meta.checkParamsValueByMeta(this.paramsValue);
    }
}

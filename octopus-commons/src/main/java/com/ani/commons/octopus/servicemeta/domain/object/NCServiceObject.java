package com.ani.commons.octopus.servicemeta.domain.object;

import com.ani.commons.octopus.objmeta.domain.ObjectMaster;

/**
 * Created by zhanglina on 18-6-22.
 */
public abstract class NCServiceObject<T extends ObjectMaster> extends ServiceObject {
    
    private String code;
    protected ObjectMaster objectMaster;

    public abstract T getObjectMaster();

    public abstract void setObjectMaster(T objectMaster);

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}

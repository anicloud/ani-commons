package com.ani.commons.octopus.servicemeta.domain.object;

import com.ani.commons.octopus.objmeta.domain.ObjectMaster;

/**
 * Created by zhanglina on 18-6-22.
 */
public class NCServiceObject<T extends ObjectMaster> extends ServiceObject {
    
    private String code;

    public NCServiceObject(T t) {
        super(t);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}

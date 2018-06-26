package com.ani.commons.octopus.servicemeta.domain.object;

import com.ani.commons.octopus.objmeta.domain.ObjectMaster;

/**
 * Created by zhanglina on 18-6-22.
 */
public class NCServiceObject<T extends ObjectMaster> extends ServiceObject {
    
    private String userCode;

    public NCServiceObject() {}
    public NCServiceObject(T t) {
        super(t);
    }

    public String getCode() {
        return userCode;
    }

    public void setCode(String userCode) {
        this.userCode = userCode;
    }

}

package com.ani.commons.octopus.servicemeta.domain.object;

import com.ani.commons.octopus.objmeta.domain.ObjectMaster;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-22.
 */
public abstract class ServiceObject<T extends ObjectMaster>  implements Serializable{

    private static final long serialVersionUID = -8187614245378127311L;

    protected T objectMaster;

    public ServiceObject() {
    }

    public ServiceObject(T objectMaster) {
        this.objectMaster = objectMaster;
    }

    public T getObjectMaster() {
        return (T)objectMaster;
    }

    public void setObjectMaster(T objectMaster) {
        this.objectMaster = objectMaster;
    }
}

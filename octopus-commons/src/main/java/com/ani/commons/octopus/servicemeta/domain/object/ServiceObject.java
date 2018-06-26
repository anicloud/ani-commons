package com.ani.commons.octopus.servicemeta.domain.object;

import com.ani.commons.octopus.objmeta.domain.ObjectMaster;

/**
 * Created by zhanglina on 18-6-22.
 */
public abstract class ServiceObject<T extends ObjectMaster> {

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

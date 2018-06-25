package com.ani.commons.octopus.servicemeta.domain.object;

import com.ani.commons.octopus.objmeta.domain.ObjectMasterPersonal;

/**
 * Created by zhanglina on 18-6-22.
 */
public class PersonalNCServiceObject extends NCServiceObject<ObjectMasterPersonal> {
    @Override
    public ObjectMasterPersonal getObjectMaster() {
        return (ObjectMasterPersonal)objectMaster;
    }

    @Override
    public void setObjectMaster(ObjectMasterPersonal objectMaster) {
         this.objectMaster=objectMaster;
    }
}

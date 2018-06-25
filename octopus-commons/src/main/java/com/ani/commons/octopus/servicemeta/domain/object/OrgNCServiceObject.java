package com.ani.commons.octopus.servicemeta.domain.object;

import com.ani.commons.octopus.objmeta.domain.ObjectMasterOrg;

/**
 * Created by zhanglina on 18-6-22.
 */
public class OrgNCServiceObject extends NCServiceObject<ObjectMasterOrg>{
    @Override
    public ObjectMasterOrg getObjectMaster() {
        return (ObjectMasterOrg)objectMaster;
    }

    @Override
    public void setObjectMaster(ObjectMasterOrg objectMaster) {
        this.objectMaster=objectMaster;
    }
}

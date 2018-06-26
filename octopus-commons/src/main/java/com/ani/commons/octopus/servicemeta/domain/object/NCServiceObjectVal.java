package com.ani.commons.octopus.servicemeta.domain.object;

/**
 * Created by ebrx on 18-6-26.
 */
public class NcServiceObjectVal extends ServiceObjectVal {
    private String userCode;

    public NcServiceObjectVal() {
    }

    public NcServiceObjectVal(String userCode) {
        this.userCode = userCode;
    }

    public String getUserCode() {
        
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}

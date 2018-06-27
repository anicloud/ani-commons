package com.ani.commons.octopus.servicemeta.domain.object;

/**
 * Created by ebrx on 18-6-26.
 */
public class NCServiceObjectVal extends ServiceObjectVal {
    private String userCode;

    public NCServiceObjectVal() {
    }

    public NCServiceObjectVal(String userCode) {
        this.userCode = userCode;
    }

    public String getUserCode() {
        
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}

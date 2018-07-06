package com.ani.commons.earth.domain.orgaccount;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-7-5.
 */
public class OrgAccountState  implements Serializable{

    private static final long serialVersionUID = -793242311850096306L;

    private Long orgId;
    private Long employeeId;
    private Short needVerify;//0null 1 phone 2email 3phone and email
    private String tgt;
    public OrgAccountState() {
    }



    public OrgAccountState(Long orgId, Long employeeId, Short needVerify, String tgt) {
        this.orgId = orgId;
        this.employeeId = employeeId;
        this.needVerify = needVerify;
        this.tgt = tgt;
    }
    public String getTgt() {
        return tgt;
    }

    public void setTgt(String tgt) {
        this.tgt = tgt;
    }
    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Short getNeedVerify() {
        return needVerify;
    }

    public void setNeedVerify(Short needVerify) {
        this.needVerify = needVerify;
    }
}

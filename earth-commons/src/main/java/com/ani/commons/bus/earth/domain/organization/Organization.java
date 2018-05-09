package com.ani.commons.bus.earth.domain.organization;

import com.ani.commons.bus.earth.domain.organization.account.OrgAccountRole;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-4-26.
 */
public class Organization implements Serializable {

    private static final long serialVersionUID = 974975520890838048L;

    private Long orgId;
    private String name;
    private String description;
    private Long ownerId;
    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Organization() {
    }

}

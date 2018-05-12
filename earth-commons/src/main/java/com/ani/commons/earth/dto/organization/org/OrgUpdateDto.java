package com.ani.commons.earth.dto.organization.org;

import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OrgUpdateDto extends AniDto implements Serializable {

    private static final long serialVersionUID = -803195226757402738L;

    private Long orgId;
    private String name;
    private String description;
    private Long opAccountId;

    public Long getOpAccountId() {
        return opAccountId;
    }

    public void setOpAccountId(Long opAccountId) {
        this.opAccountId = opAccountId;
    }

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

    public OrgUpdateDto() {
    }
}

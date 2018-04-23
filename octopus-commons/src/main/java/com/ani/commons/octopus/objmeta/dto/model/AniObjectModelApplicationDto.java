package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.bus.site.enumeration.AniSiteType;
import com.ani.commons.octopus.objmeta.object.ObjectType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-20.
 */
public abstract class AniObjectModelApplicationDto implements Serializable {

    private static final long serialVersionUID = 147262414461427098L;

    protected String name;
    protected String description;
    protected  Long accountId;
    protected ObjectType objectType;

    public abstract ObjectType getObjectType();

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public AniObjectModelApplicationDto() {
    }

    public AniObjectModelApplicationDto(String name, String description) {
        this.name = name;
        this.description = description;
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
}

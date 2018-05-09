package com.ani.commons.bus.earth.dto.organization.org;

import com.ani.utils.dto.AniDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OrgRegisterDto extends AniDto implements Serializable {

    private static final long serialVersionUID = 5608174783706635645L;

    private String name;
    private String description;
    private Long ownerId;

    // TODO: 18-4-26  add other info

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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

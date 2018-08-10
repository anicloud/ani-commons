package com.ani.commons.earth.dto.group;

import com.ani.commons.earth.enumeration.GroupType;
import com.ani.utils.dto.AniDto;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;

/**
 * Created by xuben on 18-7-26.
 * Last Modified by xuben on 18-7-26.
 */
public class AccountGroupInfoDto extends AniDto implements Serializable {
    private static final long serialVersionUID = -8616835316236418983L;

    @JsonSerialize(using= ToStringSerializer.class)
    private Long groupId;

    @JsonSerialize(using= ToStringSerializer.class)
    private Long ownerId;

    private String name;

    private String description;

    private GroupType groupType;

    public AccountGroupInfoDto(Long ownerId, String name, String description, GroupType groupType) {
        this.ownerId = ownerId;
        this.name = name;
        this.description = description;
        this.groupType = groupType;
    }

    public AccountGroupInfoDto(Long groupId, String name, String description) {
        this.groupId = groupId;
        this.name = name;
        this.description = description;
    }

    public AccountGroupInfoDto() {
    }


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

    public GroupType getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}



package com.ani.commons.earth.domain.account;

import com.ani.commons.earth.enumeration.GroupType;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Last Modified by xuben on 18-7-26.
 */
public class AniAccountGroup implements Serializable {

    private static final long serialVersionUID = -4738146609913572672L;

    private Long ownerId;

    private String name;

    private String description;

    private GroupType groupType;

    private Map<Long, Set<Long>> members;

    private Timestamp createTime;

    private Timestamp updateTime;

    private Long groupId;

    public AniAccountGroup() {
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

    public Map<Long, Set<Long>> getMembers() {
        return members;
    }

    public void setMembers(Map<Long, Set<Long>> members) {
        this.members = members;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.groupId);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}

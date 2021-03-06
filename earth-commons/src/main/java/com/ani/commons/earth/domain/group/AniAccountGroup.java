package com.ani.commons.earth.domain.group;

import com.ani.commons.earth.enumeration.GroupType;
import com.ani.utils.exception.AniRuleException;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Last Modified by xuben on 18-8-1.
 */
public class AniAccountGroup implements Serializable {

    private static final long serialVersionUID = -4738146609913572672L;

    private Long ownerId;
    private String name;
    private String description;
    private GroupType groupType;
    private Map<Long, Set<Long>> membersRolesId;
    private Set<Long> groupRolesId;
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

    public Map<Long, Set<Long>> getMembersRolesId() {
        return membersRolesId;
    }

    public Set<Long> getMemberRolesId(Long accountId) throws AniRuleException {
        Set<Long> accountRoles = null;
        if(accountId == null || !membersRolesId.containsKey(accountId)) {
            throw new AniRuleException("ACCOUNT_ID_NOT_EXIST");
        }
        return this.membersRolesId.get(accountId);
    }

    public void setMembersRolesId(Map<Long, Set<Long>> membersRolesId) {
        this.membersRolesId = membersRolesId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Set<Long> getGroupRolesId() {return groupRolesId;}

    public void setGroupRolesId(Set<Long> groupRolesId) {this.groupRolesId = groupRolesId;}


    @Override
    public int hashCode() {
        return Objects.hashCode(this.groupId);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}

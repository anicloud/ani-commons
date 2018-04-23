package com.ani.commons.bus.earth.domain.account;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class AniAccountGroup implements Serializable {

    private static final long serialVersionUID = -4738146609913572672L;
    Long groupId;
    String name;
    Set<AniAccount> members;
    Long portraitId;

    public AniAccountGroup() {
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<AniAccount> getMembers() {
        return members;
    }

    public void setMembers(Set<AniAccount> members) {
        this.members = members;
    }

    public Long getPortraitId() {
        return portraitId;
    }

    public void setPortraitId(Long portraitId) {
        this.portraitId = portraitId;
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

package com.ani.commons.octopus.objmeta;

import java.io.Serializable;
import java.util.Objects;

public abstract class AniMetaGroup implements Serializable {

    private static final long serialVersionUID = -1838991119926543955L;
    
    protected Integer groupId;

    protected String name;

    public AniMetaGroup() {
    }

    public AniMetaGroup(Integer groupId, String name) {
        this.groupId = groupId;
        this.name = name;
    }

    public Integer getGroupId() {
        if(this.groupId == null)
            return -1;
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        AniMetaGroup metaGroup = (AniMetaGroup)obj;
        return (this.hashCode() == metaGroup.hashCode());
    }

    public int hashCode() {
        return Objects.hashCode(this.groupId);
    }
}

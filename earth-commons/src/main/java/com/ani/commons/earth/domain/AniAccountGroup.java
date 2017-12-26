package com.ani.commons.earth.domain;

import java.util.Objects;
import java.util.Set;

public class AniAccountGroup {

    Long id;
    String name;
    Set<AniAccount> members;

    public AniAccountGroup() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    private Integer hashCode = null;

    @Override
    public int hashCode() {
        if(this.hashCode == null)
            this.hashCode = Objects.hashCode(this.id);
        return this.hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode;
    }
}

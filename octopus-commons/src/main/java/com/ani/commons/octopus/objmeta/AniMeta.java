package com.ani.commons.octopus.objmeta;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public abstract class AniMeta<T extends AniMetaGroup> implements Serializable {

    private static final long serialVersionUID = 5280677999928544733L;

    protected T group;

    protected Integer metaId;

    protected String name;

    protected List<AniMetaArgument> args;

    public AniMeta() {
    }

    public AniMeta(T group, Integer metaId, String name, List<AniMetaArgument> args) {
        this.group = group;
        this.metaId = metaId;
        this.name = name;
        this.args = args;
    }

    public T getGroup() {
        return group;
    }

    public void setGroup(T group) {
        this.group = group;
    }

    public Integer getMetaId() {
        if(metaId == null) return -1;
        return metaId;
    }

    public void setMetaId(Integer metaId) {
        this.metaId = metaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AniMetaArgument> getArgs() {
        return args;
    }

    public void setArgs(List<AniMetaArgument> args) {
        this.args = args;
    }

    private Long longMetaSumId = null;

    public boolean equals(Object obj) {
        if(obj == null) return false;
        return (obj.hashCode() == this.longMetaSumId.hashCode());
    }

    public int hashCode() {
        if (this.longMetaSumId == null) {
            this.longMetaSumId =
                    (this.getMetaId().longValue() << 32) | this.group.getGroupId();
        }
        return Objects.hashCode(this.longMetaSumId);
    }
}

package com.ani.commons.octopus.objmeta.dto.meta;

import com.ani.utils.core.data.meta.AniMetaMapper;
import com.ani.utils.dto.AniDto;

import java.util.Objects;

public abstract class AniMetaDto extends AniDto {

    private static final long serialVersionUID = -5608482326014409419L;

    private Integer groupId;
    private Integer metaId;

    public AniMetaDto() {
    }

    public AniMetaDto(Integer groupId, Integer metaId) {
        this.groupId = groupId;
        this.metaId = metaId;
    }


    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getMetaId() {
        return metaId;
    }

    public void setMetaId(Integer metaId) {
        this.metaId = metaId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.groupId, this.metaId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AniMetaMapper)) return false;
        AniMetaDto oneObj = (AniMetaDto) obj;
        if (oneObj.groupId == this.groupId && oneObj.metaId == this.metaId)
            return true;
        else
            return false;
    }
}

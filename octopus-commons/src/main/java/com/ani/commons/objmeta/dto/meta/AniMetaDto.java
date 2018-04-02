package com.ani.commons.objmeta.dto.meta;

import com.ani.utils.dto.AniDto;

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

    //todo: hash & equals

}

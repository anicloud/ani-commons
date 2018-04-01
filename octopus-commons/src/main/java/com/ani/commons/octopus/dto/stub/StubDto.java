package com.ani.commons.octopus.dto.stub;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-29.
 */
public class StubDto implements Serializable {

    private static final long serialVersionUID = -4657144293308519385L;

    private Integer groupId;
    private Integer metaId;

    public StubDto() {
    }

    public StubDto(Integer groupId, Integer metaId) {

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
}

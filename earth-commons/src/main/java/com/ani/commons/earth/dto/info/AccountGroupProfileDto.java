package com.ani.commons.earth.dto.info;

import java.io.Serializable;

public class AccountGroupProfileDto implements Serializable {

    private static final long serialVersionUID = -6134946490555179527L;
    Long groupId;
    String name;

    public AccountGroupProfileDto() {
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
}

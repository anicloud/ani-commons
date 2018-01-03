package com.ani.commons.earth.dto;

import java.util.Set;

/**
 * Created by zhanglina on 17-12-27.
 */
public class AniAccountGroupDto {
    Long id;
    String name;
    Set<AniAccountInfoDto> members;

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

    public Set<AniAccountInfoDto> getMembers() {
        return members;
    }

    public void setMembers(Set<AniAccountInfoDto> members) {
        this.members = members;
    }
}

package com.ani.commons.earth.dto.group;

import com.ani.utils.dto.AniDto;

import java.util.Map;
import java.util.Set;

/**
 * Created by xuben on 18-8-3.
 * Last Modified by xuben on 18-8-3.
 */
public class GroupAllMembersInfoDto extends AniDto {
    private static final long serialVersionUID = 7335217867980603248L;
    private Long groupId;
    private Map<Long, Set<Long>> members;

    public GroupAllMembersInfoDto() {
    }

    public GroupAllMembersInfoDto(Map<Long, Set<Long>> members) {
        this.members = members;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Map<Long, Set<Long>> getMembers() {
        return members;
    }

    public void setMembers(Map<Long, Set<Long>> members) {
        this.members = members;
    }
}


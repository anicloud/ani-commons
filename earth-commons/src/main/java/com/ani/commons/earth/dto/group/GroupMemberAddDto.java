package com.ani.commons.earth.dto.group;

import com.ani.utils.dto.AniDto;

import java.util.Map;
import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 */
public class GroupMemberAddDto extends AniDto {
    private static final long serialVersionUID = 7335217867980603248L;
    private Long groupId;
    private Map<Long,Set<Long>> members;

    public GroupMemberAddDto(Long groupId, Map<Long, Set<Long>> members) {
        this.groupId = groupId;
        this.members = members;
    }

    public GroupMemberAddDto() {
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

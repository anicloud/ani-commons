package com.ani.commons.octopus.objmeta.state.domain;

import com.ani.commons.octopus.objmeta.AniMetaGroup;
import com.ani.commons.octopus.objmeta.stub.dto.StubGroupInfoDto;
import org.springframework.stereotype.Component;

/**
 * Created by yeh on 15-10-16.
 */
@Component
public class AniStateGroup extends AniMetaGroup {

    public AniStateGroup() {
        super();
    }

    public AniStateGroup(Integer groupId, String name) {
        super(groupId, name);
    }

    public AniStateGroup(Integer groupId) {
        this.groupId = groupId;
    }

    public static AniStateGroup fromInfoDto(StubGroupInfoDto stubGroupInfoDto) {
        if (stubGroupInfoDto == null) return null;
        return new AniStateGroup(
                stubGroupInfoDto.groupId,
                stubGroupInfoDto.name
        );
    }
}

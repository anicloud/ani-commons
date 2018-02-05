package com.ani.commons.octopus.objmeta.stub.domain;

import com.ani.commons.octopus.objmeta.AniMetaGroup;
import com.ani.commons.octopus.objmeta.stub.dto.StubGroupInfoDto;
import org.springframework.stereotype.Component;

/**
 * Created by yeh on 15-10-16.
 */
@Component
public class AniStubGroup extends AniMetaGroup {

    public AniStubGroup() {
        super();
    }

    public AniStubGroup(Integer groupId, String name) {
        super(groupId, name);
    }

    public AniStubGroup(Integer groupId) {
        this.groupId = groupId;
    }

    public static AniStubGroup fromInfoDto(StubGroupInfoDto stubGroupInfoDto) {
        if (stubGroupInfoDto == null) return null;
        return new AniStubGroup(
                stubGroupInfoDto.groupId,
                stubGroupInfoDto.name
        );
    }
}

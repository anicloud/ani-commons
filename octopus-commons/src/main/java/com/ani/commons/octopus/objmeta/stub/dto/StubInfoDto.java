package com.ani.commons.octopus.objmeta.stub.dto;

import com.ani.commons.octopus.objmeta.AniMetaArgument;
import com.ani.utils.core.datatype.PrivilegeType;
import com.ani.utils.core.datatype.ConnType;
import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by yeh on 15-10-16.
 */
public class StubInfoDto extends AniDto{

    public Integer stubId;

    public String name;

    public StubGroupInfoDto group;

    public List<AniMetaArgument> args;

    public List<AniMetaArgument> outArgs;

    public ConnType connType;

    public PrivilegeType privilegeType;

    public StubInfoDto() {}

    public StubInfoDto(Integer stubId, String name, StubGroupInfoDto group){
        this.stubId = stubId;
        this.name = name;
        this.group = group;
    }

    public StubInfoDto(Integer stubId, String name, StubGroupInfoDto group, List<AniMetaArgument> args, List<AniMetaArgument> outArgs, ConnType connType, PrivilegeType privilegeType) {
        this.stubId = stubId;
        this.name = name;
        this.group = group;
        this.args = args;
        this.outArgs = outArgs;
        this.connType = connType;
        this.privilegeType = privilegeType;
    }
}

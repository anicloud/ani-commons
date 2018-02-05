package com.ani.commons.octopus.objmeta.stub.domain;

import com.ani.commons.octopus.objmeta.AniMeta;
import com.ani.commons.octopus.objmeta.AniMetaArgument;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yeh on 15-10-16.
 */
@Component
public class AniStub extends AniMeta<AniStubGroup> {

    private List<AniMetaArgument> outArgs;

    public AniStub() {
    }

    public AniStub(AniStubGroup group, Integer metaId, String name, List<AniMetaArgument> args, List<AniMetaArgument> outArgs) {
        super(group, metaId, name, args);
        this.outArgs = outArgs;
    }
}

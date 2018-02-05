package com.ani.commons.octopus.objmeta.state.domain;

import com.ani.commons.octopus.objmeta.AniMeta;
import com.ani.commons.octopus.objmeta.AniMetaArgument;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yeh on 15-10-16.
 */
@Component
public class AniState extends AniMeta<AniStateGroup> {
    public AniState() {
    }

    public AniState(AniStateGroup group, Integer metaId, String name, List<AniMetaArgument> args) {
        super(group, metaId, name, args);
    }
}

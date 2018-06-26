package com.ani.commons.octopus.objmeta.service;

import com.ani.commons.octopus.objmeta.domain.state.StateGroupMeta;
import com.ani.commons.octopus.objmeta.domain.state.StateMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubGroupMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubMeta;
import com.ani.commons.octopus.objmeta.dto.meta.AniMetaDto;
import com.ani.utils.core.data.meta.AniMeta;
import com.ani.utils.core.data.meta.AniMetaGroup;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by zhanglina on 18-3-29.
 */
@Service
public interface AniMetaAdminService {

    // meta group
    /**
     * <h2>Update or Insert MetaGroup</h2>
     * <p>StateGroup and StubGroup only</p>
     * @param metaGroup
     */
    public void upsertMetaGroup(AniMetaGroup metaGroup) throws AniRuleException;

    /**
     * <h2>Batch Update or Insert MetaGroup</h2>
     * <p>StateGroup and StubGroup only.</p>
     * <p>Collection contains different types is available.</p>
     * @param metaGroups
     */
    public void batchUpsertMetaGroup(Collection<AniMetaGroup> metaGroups) throws AniRuleException;

    // meta
    /**
     * <h2>Update or Insert Meta</h2>
     * <p>State and Stub only</p>
     * @param meta
     */
    public void upsertMeta(AniMeta meta) throws AniRuleException;

    /**
     * <h2>Batch Update or Insert Meta</h2>
     * <p>State and Stub only.</p>
     * <p>Collection contains different types is available.</p>
     * @param metas
     */
    public void batchUpsertMeta(Collection<AniMeta> metas) throws AniRuleException;

    /**
     * <h2>Remove Meta</h2>
     * <p>State and Stub only.</p>
     * @param meta
     */
    public void removeMeta(AniMeta meta) throws AniRuleException;

    /**
     * <h2>Batch Remove Meta</h2>
     * <p>State and Stub only, collection contains different types is available.</p>
     * @param metas
     */
    public void batchRemoveMeta(Collection<AniMeta> metas) throws AniRuleException;

}

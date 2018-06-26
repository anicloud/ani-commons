package com.ani.commons.octopus.objmeta.service;

import com.ani.commons.octopus.objmeta.domain.state.StateGroupMeta;
import com.ani.commons.octopus.objmeta.domain.state.StateMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubGroupMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubMeta;
import com.ani.commons.octopus.objmeta.dto.meta.AniMetaDto;
import com.ani.utils.exception.AniDataException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by zhanglina on 18-3-29.
 */
//@Service
public interface AniMetaService {

    // state

    /**
     * Get state group by ID from local cache
     *
     * @param groupId
     * @return StateGroupMeta if exist
     */
    public StateGroupMeta getStateGroupById(int groupId) throws AniDataException;

    /**
     * Get state meta by groupId & metaId
     *
     * @param state
     * @return StateMeta if exist, null if not exist.
     */
    public StateMeta getStateMeta(AniMetaDto state) throws AniDataException;

    /**
     * Get state meta by long id from local cache
     *
     * @param stateLongId
     * @return StateMeta, null if not exist.
     * @throws AniDataException
     */
    public StateMeta getStateMetaByLongId(long stateLongId) throws AniDataException;

    //stub
    /**
     * Get stub group meta by id
     *
     * @param groupId
     * @return StubGroupMeta if exist
     */
    public StubGroupMeta getStubGroupMetaById(int groupId) throws AniDataException;

    /**
     * Get stub meta by ID from local cache
     *
     * @param stub
     * @return StubMeta if exist, null if not exist
     * @throws AniDataException
     */
    public StubMeta getStubMeta(AniMetaDto stub) throws AniDataException;

    /**
     * Get stub meta by long id from local cache
     *
     * @param stubLongId
     * @return StubMeta, null if not exist.
     * @throws AniDataException
     */
    public StubMeta getStubMetaByLongId(long stubLongId) throws AniDataException;

    /**
     * Get stubs meta collection by longId
     *
     * @param stubsLongId
     * @return List of StubMeta.
     * @throws AniDataException
     */
    public List<StubMeta> batchGetStubsMetaByLongId(Collection<Long> stubsLongId) throws AniDataException;
}

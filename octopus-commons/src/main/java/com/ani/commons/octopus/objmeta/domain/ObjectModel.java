package com.ani.commons.octopus.objmeta.domain;

import com.ani.commons.octopus.objmeta.domain.state.StateMachineMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubMeta;
import com.ani.utils.core.DataState;
import com.ani.utils.core.data.type.PrivacyType;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ObjectModel extends AniBaseObject {

    private static final long serialVersionUID = -7225989167187564700L;

    private Long modelId;
    private String name;
    private String description;
    private String briefDesc;
    private ObjectType objectType;
    private Long devAccountId;
    private PrivacyType privacy = PrivacyType.PUBLIC;
    private DataState modelState = DataState.DISABLE;

    public ObjectModel() {
    }

    public ObjectModel(Collection<StubMeta> stubsMeta, List<StateMachineMeta> stateMachinesMeta, Long modelId, String name, String description, String briefDesc, ObjectType objectType, Long devAccountId, PrivacyType privacy, DataState modelState) {
        super(stubsMeta, stateMachinesMeta);
        this.modelId = modelId;
        this.name = name;
        this.description = description;
        this.briefDesc = briefDesc;
        this.objectType = objectType;
        this.devAccountId = devAccountId;
        this.privacy = privacy;
        this.modelState = modelState;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public Long getDevAccountId() {
        return devAccountId;
    }

    public void setDevAccountId(Long devAccountId) {
        this.devAccountId = devAccountId;
    }

    public PrivacyType getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyType privacy) {
        this.privacy = privacy;
    }

    public DataState getModelState() {
        return modelState;
    }

    public void setModelState(DataState modelState) {
        this.modelState = modelState;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.modelId);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ObjectModel))
            return false;
        ObjectModel objModel = (ObjectModel) obj;
        return this.modelId == objModel.modelId;
    }
}

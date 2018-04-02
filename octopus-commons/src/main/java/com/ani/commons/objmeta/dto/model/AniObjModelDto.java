package com.ani.commons.objmeta.dto.model;

import com.ani.commons.objmeta.dto.meta.StateMachineDto;
import com.ani.commons.objmeta.dto.meta.StubDto;
import com.ani.commons.objmeta.object.ObjectType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-3-29.
 */
public class AniObjModelDto implements Serializable {

    private static final long serialVersionUID = 887977036816140789L;

    private Long modelId;
    private String name;
    private String description;
    private ObjectType objectType;
    private List<StubDto> stubs;
    private List<StateMachineDto> stateMachines;

    public List<StateMachineDto> getStateMachines() {
        return stateMachines;
    }

    public void setStateMachines(List<StateMachineDto> stateMachines) {
        this.stateMachines = stateMachines;
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

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public List<StubDto> getStubs() {
        return stubs;
    }

    public void setStubs(List<StubDto> stubs) {
        this.stubs = stubs;
    }


}

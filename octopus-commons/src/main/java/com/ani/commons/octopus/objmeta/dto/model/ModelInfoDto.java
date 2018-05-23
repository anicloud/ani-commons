package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.earth.dto.info.AccountProfileDto;
import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.commons.octopus.objmeta.domain.state.StateMachineMeta;
import com.ani.commons.octopus.objmeta.domain.stub.StubMeta;
import com.ani.utils.core.DataState;

import java.util.List;

/**
 * Created by zhanglina on 18-4-19.
 */
public class ModelInfoDto extends ModelDto {

    private static final long serialVersionUID = 271223444264428728L;

    private String name;
    private ObjectType type;
    private AccountProfileDto devAccount;
    private List<StateMachineMeta> stateMachines;
    private List<StubMeta> stubs;
    private DataState modelState;

    public ModelInfoDto() {
    }

    public ModelInfoDto(Long modelId, String name, ObjectType type, AccountProfileDto devAccount, List<StateMachineMeta> stateMachines, List<StubMeta> stubs, DataState modelState) {
        super(modelId);
        this.name = name;
        this.type = type;
        this.devAccount = devAccount;
        this.stateMachines = stateMachines;
        this.stubs = stubs;
        this.modelState = modelState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectType getType() {
        return type;
    }

    public void setType(ObjectType type) {
        this.type = type;
    }

    public AccountProfileDto getDevAccount() {
        return devAccount;
    }

    public void setDevAccount(AccountProfileDto devAccount) {
        this.devAccount = devAccount;
    }

    public List<StateMachineMeta> getStateMachines() {
        return stateMachines;
    }

    public void setStateMachines(List<StateMachineMeta> stateMachines) {
        this.stateMachines = stateMachines;
    }

    public List<StubMeta> getStubs() {
        return stubs;
    }

    public void setStubs(List<StubMeta> stubs) {
        this.stubs = stubs;
    }

    public DataState getModelState() {
        return modelState;
    }

    public void setModelState(DataState modelState) {
        this.modelState = modelState;
    }
}

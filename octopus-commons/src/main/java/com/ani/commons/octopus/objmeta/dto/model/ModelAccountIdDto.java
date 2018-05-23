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
public class ModelAccountIdDto extends ModelDto {

    private static final long serialVersionUID = 4356944619467580748L;

    private Long accountId;

    public ModelAccountIdDto() {
    }

    public ModelAccountIdDto(Long modelId, Long accountId) {
        super(modelId);
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}

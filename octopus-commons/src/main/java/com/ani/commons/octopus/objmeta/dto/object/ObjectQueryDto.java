package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectQueryDto extends AniDto {

    private static final long serialVersionUID = 8152487956326966853L;

    private Long objectId;

    private Long accountId;

    public ObjectQueryDto() {
    }

    public ObjectQueryDto(Long objectId, Long accountId) {
        this.objectId = objectId;
        this.accountId = accountId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}

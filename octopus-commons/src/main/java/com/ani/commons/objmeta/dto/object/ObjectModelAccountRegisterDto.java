package com.ani.commons.objmeta.dto.object;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectModelAccountRegisterDto extends ObjectRegisterDto {

    private static final long serialVersionUID = -7893713192108329556L;

    Long accountId;

    public ObjectModelAccountRegisterDto() {}

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}

package com.ani.commons.octopus.objmeta.dto.object;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectRegisterForPersonDto extends ObjectRegisterDto {

    private static final long serialVersionUID = -7893713192108329556L;

    public ObjectRegisterForPersonDto() {}

    public ObjectRegisterForPersonDto(Long modelId, String name, Long ownerAccountId) {
        super(modelId, name, ownerAccountId);
    }
}

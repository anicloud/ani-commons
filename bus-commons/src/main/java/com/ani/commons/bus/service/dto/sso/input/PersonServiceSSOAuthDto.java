package com.ani.commons.bus.service.dto.sso.input;

/**
 * Created by zhanglina on 18-6-21.
 */
public class PersonServiceSSOAuthDto extends ServiceSSOAuthDto {

    private static final long serialVersionUID = 2782826687902963072L;

    public PersonServiceSSOAuthDto() {
    }

    public PersonServiceSSOAuthDto(Long objectId, Long requestAccountId) {
        super(objectId, requestAccountId);
    }
}

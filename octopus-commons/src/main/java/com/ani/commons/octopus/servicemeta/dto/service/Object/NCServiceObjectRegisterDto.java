package com.ani.commons.octopus.servicemeta.dto.service.Object;

import com.ani.commons.octopus.objmeta.dto.object.ObjectRegisterDto;

/**
 * Created by zhanglina on 18-6-25.
 */
public class NCServiceObjectRegisterDto<T extends ObjectRegisterDto> extends ServiceObjectRegisterDto {

    private static final long serialVersionUID = 1533346195816800785L;

    private String userCode;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}

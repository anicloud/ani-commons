package com.ani.commons.earth.dto.id;

/**
 * Created by zhanglina on 18-7-3.
 */
public class AccountUsernameInfoDto extends AccountIdInfoDto {

    private static final long serialVersionUID = 3348407579185510792L;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

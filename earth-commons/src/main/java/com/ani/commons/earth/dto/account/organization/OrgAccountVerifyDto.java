package com.ani.commons.earth.dto.account.organization;

import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-7-5.
 */
public  class OrgAccountVerifyDto extends AniDto {

    private static final long serialVersionUID = 3806968368224006095L;
    private Long orgAccountId;
    private String username;
    private String password;

    public OrgAccountVerifyDto() {
    }

    public OrgAccountVerifyDto(Long orgAccountId, String username, String password) {
        this.orgAccountId = orgAccountId;
        this.username = username;
        this.password = password;
    }

    public Long getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(Long orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

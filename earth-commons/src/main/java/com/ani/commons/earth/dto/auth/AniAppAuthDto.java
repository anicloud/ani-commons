package com.ani.commons.earth.dto.auth;

import com.ani.utils.dto.AniDto;

public class AniAppAuthDto extends AniDto {

    String appId;
    String ticket;

    public AniAppAuthDto() {
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    
}

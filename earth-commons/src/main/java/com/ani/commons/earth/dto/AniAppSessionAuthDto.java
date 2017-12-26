package com.ani.commons.earth.dto;

import com.ani.utils.dto.AniDto;

public class AniAppSessionAuthDto extends AniDto {

    String aniSession;

    public AniAppSessionAuthDto() {
    }

    public String getAniSession() {
        return aniSession;
    }

    public void setAniSession(String aniSession) {
        this.aniSession = aniSession;
    }
}

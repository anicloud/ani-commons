package com.ani.commons.bus.earth.dto.auth;

import com.ani.utils.dto.AniDto;

import java.io.Serializable;

public class AniAccountAuthDto extends AniDto implements Serializable {

    private static final long serialVersionUID = 7317114042514572675L;

    String aniAccountToken;

    public AniAccountAuthDto() {
    }

    public AniAccountAuthDto(String aniAccountToken) {
        this.aniAccountToken = aniAccountToken;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAniAccountToken() {
        return aniAccountToken;
    }

    public void setAniAccountToken(String aniAccountToken) {
        this.aniAccountToken = aniAccountToken;
    }
}

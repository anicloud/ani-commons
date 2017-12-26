package com.ani.commons.earth.dto;

import com.ani.commons.earth.enumeration.AuthState;
import com.ani.utils.dto.AniDto;

public class AniAccountAuthDto extends AniDto {

    String anitgt;

    public AniAccountAuthDto() {
    }

    public AniAccountAuthDto(String anitgt) {
        this.anitgt = anitgt;
    }

    public String getAnitgt() {
        return anitgt;
    }

    public void setAnitgt(String anitgt) {
        this.anitgt = anitgt;
    }
}

package com.ani.commons.site.dto;

import com.ani.commons.site.dto.miniapp.AniSiteWCUserDto;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-11.
 */
public class AniMiniAppUserValidateDto extends AniUserValidateDto implements Serializable{

    private static final long serialVersionUID = -4771646559565037435L;

    private AniSiteWCUserDto aniSiteWCUser;

    public AniSiteWCUserDto getAniSiteWCUser() {
        return aniSiteWCUser;
    }

    public void setAniSiteWCUser(AniSiteWCUserDto aniSiteWCUser) {
        this.aniSiteWCUser = aniSiteWCUser;
    }

    public AniMiniAppUserValidateDto() {
    }

    public AniMiniAppUserValidateDto(AniSiteWCUserDto aniSiteWCUser) {
        this.aniSiteWCUser = aniSiteWCUser;
    }
}

package com.ani.commons.site.dto;

/**
 * Created by zhanglina on 18-4-11.
 */
public class AniPubAccountUserValidateDto extends AniUserValidateDto {
    private String code;

    public AniPubAccountUserValidateDto(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }
}

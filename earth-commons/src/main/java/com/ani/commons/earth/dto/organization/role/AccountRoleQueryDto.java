package com.ani.commons.earth.dto.organization.role;

import com.ani.utils.dto.AniDto;

/**
 * Created by ebrx on 18-7-26.
 */
public class AccountRoleQueryDto extends AniDto {
    private static final long serialVersionUID = 2658212645942703267L;

    private Long id;
    private Long owner_id;

    public AccountRoleQueryDto(Long id, Long owner_id) {
        this.id = id;
        this.owner_id = owner_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Long owner_id) {
        this.owner_id = owner_id;
    }
}

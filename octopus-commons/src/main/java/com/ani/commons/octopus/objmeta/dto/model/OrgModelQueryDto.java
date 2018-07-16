package com.ani.commons.octopus.objmeta.dto.model;

import com.ani.commons.octopus.objmeta.domain.ObjectType;
import com.ani.utils.dto.AniDto;

/**
 * Created by zhanglina on 18-5-23.
 */
public class OrgModelQueryDto extends OrgModelOpDto {

    private static final long serialVersionUID = 2423825827389972278L;
    ObjectType objectType;

    public OrgModelQueryDto(Integer orgId, Long opAccountId, ObjectType objectType) {
        super(orgId, opAccountId);
        this.objectType = objectType;
    }
}

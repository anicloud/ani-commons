package com.ani.commons.earth.dto.group;

import com.ani.commons.earth.domain.account.organization.OrgAccountRole;
import com.ani.utils.dto.AniDto;

import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 */
public class GroupMemberInfoDto extends AniDto {
    private static final long serialVersionUID = -4889324214752309538L;
    private Long accountId;
    private String name;
    private Set<OrgAccountRole> roles;
}

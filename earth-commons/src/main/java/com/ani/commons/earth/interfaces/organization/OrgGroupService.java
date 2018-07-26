package com.ani.commons.earth.interfaces.organization;

import com.ani.commons.earth.domain.organization.tree.OrgMember;
import com.ani.commons.earth.dto.organization.group.OrgGroupAddDto;

/**
 * Created by zhanglina on 18-7-25.
 */
public interface OrgGroupService {
    public void addOrgGroup(OrgGroupAddDto orgGroupAddDto);
    public void addMemberToGroup();
    public OrgMember getOrgMembersByGroupId(Long groupId);
}

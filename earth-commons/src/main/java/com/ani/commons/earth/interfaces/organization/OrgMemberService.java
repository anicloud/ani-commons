package com.ani.commons.earth.interfaces.organization;

import com.ani.commons.earth.domain.orgaccount.OrgAccountState;
import com.ani.commons.earth.domain.organization.tree.OrgMember;
import com.ani.commons.earth.dto.orgaccount.OrgAccountVerifyDto;
import com.ani.commons.earth.dto.orgaccount.OrgMemberQueryDto;
import com.ani.commons.earth.dto.organization.org.OrgMemberInfoDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

/**
 * Created by zhanglina on 18-7-6.
 */
public interface OrgMemberService {
    public OrgMember getOrgMemberById(OrgMemberQueryDto memberQueryDto);
    public void updateOrgMemberInfo(OrgMemberInfoDto orgMemberInfoDto)throws AniDataException;
    public OrgAccountState loginByOrg(String sessionId, OrgAccountVerifyDto orgAccountVerifyDto) throws AniAuthException,AniRuleException;

}

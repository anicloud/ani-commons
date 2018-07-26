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

    /**
     * <H2>Add employee info.</H2>
     * @param orgMemberInfoDto
     */
    public void addOrgMember(OrgMemberInfoDto orgMemberInfoDto);

    /**
     * <H2>Delete employee info by id.</H2>
     * @param employeeId
     */
    public void deleteOrgMemberInfoById(Long employeeId,Long accoundId);

    /**
     * <H2>Update employee info.</H2>
     * @param orgMemberInfoDto
     * @throws AniDataException
     */
    public void updateOrgMemberInfo(OrgMemberInfoDto orgMemberInfoDto)throws AniDataException;

    /**
     * <H2>Query employee info.</h2>
     * @param memberQueryDto
     * @return OrgMember
     */
    public OrgMember getOrgMemberById(OrgMemberQueryDto memberQueryDto);

    /**
     * <H2>Login state check.</H2>
     * @param sessionId
     * @param orgAccountVerifyDto
     * @return OrgAccountState
     * @throws AniAuthException
     * @throws AniRuleException
     */
    public OrgAccountState loginByOrg(String sessionId, OrgAccountVerifyDto orgAccountVerifyDto) throws AniAuthException,AniRuleException;

}

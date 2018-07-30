package com.ani.commons.earth.interfaces.organization;

import com.ani.commons.earth.domain.account.organization.OrgAccountState;
import com.ani.commons.earth.domain.account.organization.OrgMemberInfo;
import com.ani.commons.earth.domain.organization.employee.OrgMember;
import com.ani.commons.earth.dto.account.organization.OrgAccountVerifyDto;
import com.ani.commons.earth.dto.account.organization.OrgMemberQueryDto;
import com.ani.commons.earth.dto.organization.org.OrgMemberInfoDto;
import com.ani.utils.exception.AniAuthException;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.util.List;

/**
 * Created by zhanglina on 18-7-6.
 */
public interface OrgMemberService {

    /**
     * <H2>Add employee info.</H2>
     * @param orgMemberInfoDto
     */
    public void addOrgMember(Long opAccountId,OrgMemberInfoDto orgMemberInfoDto) throws AniDataException, AniRuleException;

    /**
     * <H2>Delete employee info by id.</H2>
     * @param memberQueryDto
     */
    public void deleteOrgMemberInfoById(OrgMemberQueryDto memberQueryDto);

    /**
     * <H2>Update employee info.</H2>
     * @param memberQueryDto
     * @param orgMemberInfoDto
     * @throws AniDataException
     */
    public void updateOrgMemberInfo(OrgMemberQueryDto memberQueryDto, OrgMemberInfoDto orgMemberInfoDto) throws AniDataException, AniRuleException;

    /**
     * <H2>Query employee info.</h2>
     * @param memberQueryDto
     * @return OrgMember
     */
    public OrgMember getOrgMemberById(OrgMemberQueryDto memberQueryDto);

    /**
     * <H2>Query employee list.</H2>
     * @param nodeId,accountId
     * @return
     */
    public List<OrgMemberInfo> getOrgMemberListByNodeId(Long nodeId, Long accountId);

    /**
     * <H2>Login state check.</H2>
     * @param sessionId
     * @param orgAccountVerifyDto
     * @return OrgAccountState
     * @throws AniAuthException
     * @throws AniRuleException
     */
    public OrgAccountState loginByOrg(String sessionId, OrgAccountVerifyDto orgAccountVerifyDto) throws AniAuthException,AniRuleException;

    /**
     * <H2>Query employee info by email.</H2>
     * @param email
     * @param accountId
     * @return OrgMember
     */
    public OrgMember getOrgMemberById(String email,Long accountId);
}

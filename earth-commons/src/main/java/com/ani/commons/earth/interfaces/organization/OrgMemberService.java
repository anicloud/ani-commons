package com.ani.commons.earth.interfaces.organization;

import com.ani.commons.earth.domain.account.organization.OrgAccountState;
import com.ani.commons.earth.domain.organization.employee.OrgMember;
import com.ani.commons.earth.dto.account.organization.OrgAccountVerifyDto;
import com.ani.commons.earth.dto.account.organization.OrgMemberQueryDto;
import com.ani.commons.earth.dto.organization.OrgMemberBriefDto;
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
     *
     * @param orgMemberInfoDto
     */
    public void addOrgMember(Long opAccountId, OrgMemberInfoDto orgMemberInfoDto) throws AniDataException, AniRuleException, AniAuthException;

    /**
     * <H2>Delete employee info by id.</H2>
     *
     * @param memberQueryDto
     */
    public void deleteOrgMemberById(Long opAccountId, OrgMemberQueryDto memberQueryDto) throws AniRuleException, AniAuthException;

    /**
     * <H2>Update employee info.</H2>
     *
     * @param
     * @param orgMemberInfoDto
     * @throws AniDataException
     */
    public void updateOrgMemberInfo(Long opAccountId, OrgMemberInfoDto orgMemberInfoDto) throws AniDataException, AniRuleException, AniAuthException;

    /**
     * <H2>Query employee info.</h2>
     *
     * @param
     * @return OrgMember
     */
    public OrgMember getOrgMemberById(Long opAccountId, OrgMemberQueryDto memberQueryDto) throws AniRuleException;

    /**
     * <H2>Query employee list.</H2>
     *
     * @param nodeId,accountId
     * @return
     */
    public List<OrgMemberBriefDto> getOrgMemberListByNodeId(Long opAccountId, Long orgAccountId, Long nodeId) throws AniRuleException;

    /**
     * <H2>Login state check.</H2>
     *
     * @param sessionId
     * @param orgAccountVerifyDto
     * @return OrgAccountState
     * @throws AniAuthException
     * @throws AniRuleException
     */
    public OrgAccountState loginByOrg(String sessionId, OrgAccountVerifyDto orgAccountVerifyDto) throws AniAuthException, AniRuleException;

}

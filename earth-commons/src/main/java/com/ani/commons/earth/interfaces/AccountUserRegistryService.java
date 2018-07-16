package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.auth.AniAccountAuthState;
import com.ani.commons.earth.dto.id.AccountIdInfoDto;
import com.ani.commons.earth.dto.info.AccountProfileDto;
import com.ani.commons.earth.dto.register.AccountInsideRegInitDto;
import com.ani.commons.earth.dto.register.AccountInsideRegisterDto;
import com.ani.commons.earth.dto.register.AccountTransparentRegisterDto;
import com.ani.commons.earth.dto.register.OrgAccountInsideRegisterDto;
import com.ani.commons.earth.dto.verification.AccountPwdVerifyDto;
import com.ani.commons.earth.dto.verification.AccountIdVerifyDto;
import com.ani.commons.earth.dto.verification.AccountVerifyDto;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.io.IOException;
import java.util.List;

/**
 * Created by zhanglina on 17-12-27.
 * Last Modified by xuben on 18-7-16.
 */
public interface AccountUserRegistryService {

    /**
     * <h2>Send verification code to phone or email.</h2>
     *
     * @throws AniRuleException email/phone number format error
     */
    public void sendVerificationCode(String sessionId, AccountIdInfoDto accountIdInfoDto) throws AniRuleException;

    public void checkEmailOrPhone(String sessionId,AccountIdVerifyDto accountIdVerifyDto) throws AniRuleException;
    /**
     * <h2>Register account number by email or phone.</h2>
     *
     * @param accountIdVerifyDto
     * @return AniAccount
     * @throws AniRuleException update by zhanglina 2018-02-26 AccountIdInfoDto to AccountIdVerifyDto
     */
    public Long register(String sessionId, AccountIdVerifyDto accountIdVerifyDto) throws AniRuleException;


    public List<AccountInsideRegInitDto> registerOrgAccountInside(OrgAccountInsideRegisterDto orgInsideRegisterDto) throws AniRuleException;

    public Long bindOrRegisterAccountForOrgMember(AccountInsideRegisterDto accountInsideRegisterDto) throws AniRuleException;

    public AccountInsideRegInitDto registerSingleOrgAccount(AccountInsideRegisterDto accountInsideRegisterDto, Integer orgId)throws AniRuleException, AniDataException ;

    /**
     * <h2>Register account without basic info</h2>
     *
     * @param transparentRegisterDto no property required
     * @return AniAccount
     * @throws AniRuleException
     */
    public AniAccountAuthState registerTransparently(AccountTransparentRegisterDto transparentRegisterDto) throws AniRuleException;
    /**
     * <h2>Close an account</h2>
     *
     * @param accountPwdVerifyDto
     * @throws AniDataException
     */
    public void closeAccount(AccountPwdVerifyDto accountPwdVerifyDto) throws AniRuleException;
    /**
     * <h2>Modify account identification info</h2>
     * <p>Modify or add a kind of identification info of an account.</p>
     *
     * @param accountIdVerifyDto
     * @throws AniRuleException
     */
    public void modifyAccountIdInfo(String sessionId, AccountIdVerifyDto accountIdVerifyDto) throws AniRuleException;
    /**
     * <h2>Change user account password in case of being verified.</h2>
     * <p>User should be verified by email, phone etc.</p>
     *
     * @param sessionId
     * @param tgt
     * @param newPwd
     * @param flag
     *
     * @throws AniRuleException
     */
    public void changePassword(AccountVerifyDto accountVerifyDto, String sessionId,String tgt, byte[] newPwd,Boolean flag) throws AniRuleException;

    public void  modifyProfile(AccountProfileDto accountProfileDto) throws AniRuleException, IOException;

    public String bindEmailOrPhoneForOrg(String sessionId,AccountIdVerifyDto accountIdVerifyDto)throws AniRuleException;

}

package com.ani.commons.bus.earth.interfaces;

import com.ani.commons.bus.earth.domain.account.AniAccount;
import com.ani.commons.bus.earth.domain.auth.AniAccountAuthState;
import com.ani.commons.bus.earth.domain.id.AccountIdInfo;
import com.ani.commons.bus.earth.dto.id.AccountIdInfoDto;
import com.ani.commons.bus.earth.dto.info.AccountProfileDto;
import com.ani.commons.bus.earth.dto.register.AccountRegisterDto;
import com.ani.commons.bus.earth.dto.register.AccountTransparentRegisterDto;
import com.ani.commons.bus.earth.dto.verification.AccountPwdVerifyDto;
import com.ani.commons.bus.earth.dto.verification.AccountIdVerifyDto;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

import java.io.IOException;

/**
 * Created by zhanglina on 17-12-27.
 */
public interface AccountUserRegistryService {

    /**
     * <h2>Send verification code to phone or email.</h2>
     *
     * @throws AniRuleException email/phone number format error
     */
    public void sendVerificationCode(String sessionId, AccountIdInfoDto accountIdInfoDto) throws AniRuleException;

    /**
     * <h2>Register account number by email or phone.</h2>
     *
     * @param accountRegisterDto
     * @return AniAccount
     * @throws AniRuleException update by zhanglina 2018-02-26 AccountIdInfoDto to AccountIdVerifyDto
     */
    public Long register(String sessionId, AccountRegisterDto accountRegisterDto) throws AniRuleException;

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


    public void modifyAccountIdInfoTransparently(AccountIdInfo accountIdInfo);

    /**
     * <h2>Change user account password in case of being verified.</h2>
     * <p>User should be verified by email, phone etc.</p>
     *
     * @param accountPwdVerifyDto
     * @param newPwd
     * @throws AniRuleException
     */
    public void changePassword(AccountPwdVerifyDto accountPwdVerifyDto, Byte[] newPwd) throws AniRuleException;

    public AniAccount modifyProfile(AccountProfileDto accountProfileDto, String prefix) throws AniRuleException, IOException;

}
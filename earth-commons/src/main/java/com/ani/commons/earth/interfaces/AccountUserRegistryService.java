package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.account.AniAccount;
import com.ani.commons.earth.dto.id.AccountIdInfoDto;
import com.ani.commons.earth.dto.verification.AccountPwdVerifyDto;
import com.ani.commons.earth.dto.verification.AccountIdVerifyDto;
import com.ani.commons.earth.dto.verification.AccountVerifyDto;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

/**
 * Created by zhanglina on 17-12-27.
 */
public interface AccountUserRegistryService {

    /**
     * <h2>Send verification code to phone or email.</h2>
     * @param accountIdInfoDto Subclass of AccountIdInfoDto: e.g. AccountEmailInfoDto and AccountPhoneInfoDto
     * @throws AniRuleException email/phone number format error
     */
    public void sendVerificationCode(AccountIdInfoDto accountIdInfoDto) throws AniRuleException;

    /**
     * <h2>Register account number by email or phone.</h2>
     * @param accountIdInfoDto
     * @throws AniRuleException
     */
    public AniAccount accountRegister(AccountIdInfoDto accountIdInfoDto) throws AniRuleException;

    public AniAccount accountRegister() throws AniRuleException;

    /**
     * <h2>Close an account</h2>
     * @param accountPwdVerifyDto
     * @throws AniDataException
     */
    public void closeAccount(AccountPwdVerifyDto accountPwdVerifyDto) throws AniRuleException;

    /**
     * <h2>Modify account identification info</h2>
     * <p>Modify or add a kind of identification info of an account.</p>
     * @param accountIdVerifyDto
     * @throws AniRuleException
     */
    public void modifyAccountIdInfo(AccountIdVerifyDto accountIdVerifyDto) throws AniRuleException;

    /**
     * <h2>Change user account password in case of being verified.</h2>
     * <p>User should be verified by email, phone etc.</p>
     * @param accountPwdVerifyDto
     * @param newPwd
     * @throws AniRuleException
     */
    public void changePassword(AccountPwdVerifyDto accountPwdVerifyDto, Byte[] newPwd) throws AniRuleException;

}

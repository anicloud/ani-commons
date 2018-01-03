package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.PhoneNum;
import com.ani.commons.earth.dto.AniAccountIdDto;
import com.ani.commons.earth.dto.EmailDto;
import com.ani.commons.earth.dto.PhoneNumDto;
import com.ani.commons.earth.dto.PwdDto;
import com.ani.commons.earth.dto.auth.AniAccountLoginDto;
import com.ani.commons.earth.dto.register.RegisterDto;
import com.ani.commons.earth.dto.verification.AccountEmailVerificationDto;
import com.ani.commons.earth.dto.verification.AccountPhoneVerificationDto;
import com.ani.commons.earth.dto.verification.AccountVerificationDto;
import com.ani.utils.exception.AniDataException;
import com.ani.utils.exception.AniRuleException;

/**
 * Created by zhanglina on 17-12-27.
 */
public interface AccountRegistoryService {

    //注册
    public void sendPhoneVerificationCode(PhoneNumDto phoneNum, Long expireMs) throws AniDataException;

    public void sendMailVerificationCode(EmailDto email, Long expireMs) throws AniDataException;

    public void accountRegister(RegisterDto registerDto) throws AniRuleException,AniDataException;

    //关闭
    public void closeAccount(PwdDto pwdDto) throws AniDataException;

    //修改
    public void changePhone(AccountPhoneVerificationDto accountPhoneVerificationDto) throws AniDataException;

    public void changeEmail(AccountEmailVerificationDto accountEmailVerificationDto)throws AniDataException;

    public void changePassword(PwdDto pwdDto, byte[] newPwd) throws AniDataException;

    //找回密码
    public void retrievePassword(AccountVerificationDto verificationDto, String newPwd)throws AniDataException;
    //登录
    public void loginByPhoneNumber(PhoneNumDto phoneNumDto,byte[] password) throws AniDataException;

    public void loginByEmail(EmailDto emailDto,byte[] password) throws AniDataException;

    public void loginByVerificationCode(AccountVerificationDto verificationDto)throws AniDataException;
}

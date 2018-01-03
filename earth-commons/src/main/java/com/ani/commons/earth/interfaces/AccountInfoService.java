package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.PhoneNum;
import com.ani.commons.earth.dto.AniAccountInfoDto;
import com.ani.commons.earth.dto.AniAccountGroupDto;

import java.util.List;

public interface AccountInfoService {

    public List<AniAccountInfoDto> findAllAliveAcounts();
    public List<AniAccountInfoDto> findAllClosedAcounts();
    public AniAccountInfoDto findByaccountId(Long id);

    //登录
    public AniAccountInfoDto loadByPhoneNum(PhoneNum phoneNum, String password);
    public AniAccountInfoDto loadByEmail(String email, String password);
    public AniAccountInfoDto loadByUsername(String username, String password);

    public AniAccountInfoDto modifyBaseInfo(AniAccountInfoDto aniAccountInfoDto);

    public String modifyPortrait(Long accountId,String portraitUrl);
    //group
    public List<AniAccountGroupDto> findGroupByAccountId(Long accountId);
    public AniAccountGroupDto findByGroupId(Long groupId);
    public boolean removeAccountFromGroup(Long groupId,List<Long> accountIds);
    public boolean addAccountToGroup(Long groupId,List<Long> accountIds);
    public AniAccountGroupDto modifyGroupName(Long groupId,String name);
    public boolean removeGroup(Long groupId);
    public boolean clearGroup(Long accountId);


}

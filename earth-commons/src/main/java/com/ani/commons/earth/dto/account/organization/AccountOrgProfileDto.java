package com.ani.commons.earth.dto.account.organization;

import com.ani.commons.earth.dto.account.AccountProfileDto;
import com.ani.commons.earth.enumeration.AccountType;

/**
 * Created by zhanglina on 18-7-26.
 */
public class AccountOrgProfileDto extends AccountProfileDto {

    private String tel;

    private Integer businessCategory;

    private String postalCode;

    private String postalAddress;

    public AccountOrgProfileDto(Long accountId, String name, String password, String userName, AccountType accountType, String tel, Integer businessCategory, String postalCode, String postalAddress) {
        super(accountId, name, password, userName, accountType);
        this.tel = tel;
        this.businessCategory = businessCategory;
        this.postalCode = postalCode;
        this.postalAddress = postalAddress;
    }
}

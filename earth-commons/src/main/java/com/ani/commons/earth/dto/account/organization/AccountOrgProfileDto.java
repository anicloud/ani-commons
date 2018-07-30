package com.ani.commons.earth.dto.account.organization;

import com.ani.commons.earth.dto.account.AccountProfileDto;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.BusinessCategoryType;

import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 */
public class AccountOrgProfileDto extends AccountProfileDto {

    private String tel;

    private Set<BusinessCategoryType> businessCategory;

    private String postalCode;

    private String postalAddress;

    public AccountOrgProfileDto(Long accountId, String name, String password, String userName, AccountType accountType, String tel, Set<BusinessCategoryType> businessCategory, String postalCode, String postalAddress) {
        super(accountId, name, password, userName, accountType);
        this.tel = tel;
        this.businessCategory = businessCategory;
        this.postalCode = postalCode;
        this.postalAddress = postalAddress;
    }

    public AccountOrgProfileDto() {
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Set<BusinessCategoryType> getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(Set<BusinessCategoryType> businessCategory) {
        this.businessCategory = businessCategory;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
}

package com.ani.commons.earth.dto.account.organization;

import com.ani.commons.earth.dto.account.AccountProfileDto;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.BusinessCategoryType;

import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 */
public class AccountOrgProfileDto extends AccountProfileDto {
    private static final long serialVersionUID = -8218806733359290508L;
    private String tel;
    private String description;
    private Set<BusinessCategoryType> businessCategory;
    private String registeredAddress;
    private String postalCode;
    private String postalAddress;
    private String isNew;

    public AccountOrgProfileDto(Long accountId, String name, String password, String userName, AccountType accountType, String tel, String description, Set<BusinessCategoryType> businessCategory, String registeredAddress, String postalCode, String postalAddress, String isNew) {
        super(accountId, name, password, userName, accountType);
        this.tel = tel;
        this.description = description;
        this.businessCategory = businessCategory;
        this.registeredAddress = registeredAddress;
        this.postalCode = postalCode;
        this.postalAddress = postalAddress;
        this.isNew = isNew;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public AccountOrgProfileDto() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

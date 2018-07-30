package com.ani.commons.earth.domain.account.organization;

import com.ani.commons.earth.domain.account.AniAccount;
import com.ani.commons.earth.enumeration.AccountType;
import com.ani.commons.earth.enumeration.BusinessCategoryType;

import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 * Last Modified by xuben on 18-7-26.
 */
public class AniOrgAccount extends AniAccount {

    private static final long serialVersionUID = -134318695674072172L;

    private Integer currentNum;
    private String tel;
    private Set<BusinessCategoryType> businessCategorys;
    private String postalCode;
    private String postalAddress;
    public AniOrgAccount() {
        super();
    }

    public AniOrgAccount(Long accountId, String phone, String email, AccountType type, Integer currentNum, String tel, Set<BusinessCategoryType> businessCategorys, String postalCode, String postalAddress) {
        super(accountId, phone, email, type);
        this.currentNum = currentNum;
        this.tel = tel;
        this.businessCategorys = businessCategorys;
        this.postalCode = postalCode;
        this.postalAddress = postalAddress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Set<BusinessCategoryType> getBusinessCategorys() {
        return businessCategorys;
    }

    public void setBusinessCategorys(Set<BusinessCategoryType> businessCategorys) {
        this.businessCategorys = businessCategorys;
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

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }
}

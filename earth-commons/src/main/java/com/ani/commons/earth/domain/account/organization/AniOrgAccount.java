package com.ani.commons.earth.domain.account.organization;

import com.ani.commons.earth.domain.account.AniAccount;
import com.ani.commons.earth.enumeration.AccountType;

/**
 * Created by zhanglina on 18-7-26.
 * Last Modified by xuben on 18-7-26.
 */
public class AniOrgAccount extends AniAccount {

    private static final long serialVersionUID = -134318695674072172L;

    private Integer currentNum;

    private String tel;

    private Integer businessCategory;

    private String postalCode;

    private String postalAddress;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(Integer businessCategory) {
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

    public AniOrgAccount() {
        super();
    }

    public AniOrgAccount(Long accountId, String phone, String email, Boolean hasPwd, AccountType type, Integer currentNum) {
        super(accountId, phone, email, hasPwd, type);
        this.currentNum = currentNum;
    }
}

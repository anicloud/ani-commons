package com.ani.commons.earth.domain.organization.node;


/**
 * Created by xuben on 18-7-26.
 */
public class Organization extends OTNode {
    private static final long serialVersionUID = 6831513362005090832L;

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

}

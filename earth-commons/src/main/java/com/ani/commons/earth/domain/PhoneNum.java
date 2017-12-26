package com.ani.commons.earth.domain;

import com.ani.commons.earth.enumeration.AccountType;

public class PhoneNum {

    PhoneRegion region;
    String phoneNum;

    public PhoneNum() {
    }

    public PhoneNum(PhoneRegion region, String phoneNum) {
        this.region = region;
        this.phoneNum = phoneNum;
    }
}

package com.ani.commons.earth.domain;

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

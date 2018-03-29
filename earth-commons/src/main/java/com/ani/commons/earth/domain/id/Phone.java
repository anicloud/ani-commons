package com.ani.commons.earth.domain.id;

import java.io.Serializable;

public class Phone extends AccountId implements Serializable {
    private static final long serialVersionUID = -1404713055789281247L;
    /*modify by zhanglina 2018-02-26*/
    String region;
    String phoneNum;

    public Phone() {
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Phone(String region, String phoneNum) {

        this.region = region;
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public class PhoneRegion {

        char[] region;
        short regionNum;

        public PhoneRegion() {
        }

        public PhoneRegion(char[] region, short regionNum) {
            this.region = region;
            this.regionNum = regionNum;
        }

    }

}

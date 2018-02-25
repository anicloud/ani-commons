package com.ani.commons.earth.domain.id;

public class Phone extends AccountId {

    PhoneRegion region;
    String phoneNum;

    public Phone() {
    }

    public Phone(PhoneRegion region, String phoneNum) {
        this.region = region;
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

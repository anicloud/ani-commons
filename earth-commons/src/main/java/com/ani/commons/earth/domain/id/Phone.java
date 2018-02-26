package com.ani.commons.earth.domain.id;

public class Phone extends AccountId {
/*modify by zhanglina 2018-02-26*/
    Short region;
    String phoneNum;

    public Phone() {
    }

    public Phone(Short region, String phoneNum) {
        this.region = region;
        this.phoneNum = phoneNum;
    }

    public Short getRegion() {
        return region;
    }

    public void setRegion(Short region) {
        this.region = region;
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

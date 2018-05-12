package com.ani.commons.earth.domain.id;

import java.io.Serializable;

public class Phone extends AccountId implements Serializable {

    private static final long serialVersionUID = -1404713055789281247L;

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


    public String getPhone(){
        return region+"-"+phoneNum;
    }
}

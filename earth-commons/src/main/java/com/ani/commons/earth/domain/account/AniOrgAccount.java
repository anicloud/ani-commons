package com.ani.commons.earth.domain.account;

import com.ani.commons.earth.domain.id.Phone;

/**
 * Created by zhanglina on 18-2-27.
 */
public class AniOrgAccount extends AniAccount {
    /**
     * Account name
     */
    String name;

    String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AniOrgAccount() {

    }


}

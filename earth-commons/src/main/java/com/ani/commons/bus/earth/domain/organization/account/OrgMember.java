package com.ani.commons.bus.earth.domain.organization.account;
import com.ani.commons.bus.earth.domain.account.AniAccount;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-2-27.
 */
public class OrgMember implements Serializable{
    private static final long serialVersionUID = -1592699861144156040L;
    /**
     * Account name
     */
    AniAccount account;
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

    public OrgMember() {

    }


}

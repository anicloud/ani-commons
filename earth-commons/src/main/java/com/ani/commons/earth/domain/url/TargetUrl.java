package com.ani.commons.earth.domain.url;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-3-28.
 */
public class TargetUrl implements Serializable {
    private static final long serialVersionUID = -2821056743458074027L;
    String sid;
    String url;

    public TargetUrl(String sid, String url) {
        this.sid = sid;
        this.url = url;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

package com.ani.commons.earth.domain.response;

import javax.servlet.http.Cookie;

/**
 * Created by zhanglina on 18-3-22.
 */
public class SessionCookie {
    private Cookie cookie;

    public Cookie getCookie() {
        return cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public SessionCookie(String value){
        cookie=new Cookie("aniSessionId",value);
        cookie.setMaxAge(-1);
        cookie.setPath("/");
    }
}

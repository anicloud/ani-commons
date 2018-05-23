package com.ani.commons.earth.domain.response;

import javax.servlet.http.Cookie;

/**
 * Created by zhanglina on 18-3-22.
 */
public class TokenCookie {
    private Cookie cookie;

    public Cookie getCookie() {
        return cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public TokenCookie(String value){
        cookie=new Cookie("tgt",value);
        cookie.setMaxAge(30*24*60*60);
        cookie.setPath("/");
    }
}

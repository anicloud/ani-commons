package com.ani.commons.bus.site.enumeration;

/**
 * Created by zhanglina on 18-4-18.
 */
public enum  ExceptionType {
    UNIONID_NULL,//unionid 获取不到
    APPSECRET_ERROR,//appSecret过期
    WECHAT_SERVER_TIME_OUT,//微信请求超时
    WECHAT_ERROR, //微信请求失败
    INVALID_ALGORITHM_PARAMETER, //请求参数
    UNSUPPORTED_ENCODING//
}

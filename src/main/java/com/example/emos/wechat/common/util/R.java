package com.example.emos.wechat.common.util;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String,Object> {//可保存任何类型的对象

    public R() {
        put("code", HttpStatus.SC_OK);
        put("msg", "success");
    }

    //链式传递
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
   }

    public static R ok() {
        return new R();
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R error(int code, String msg) { //请求不成功的状态码
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R error(String msg) { //请求不成功的状态码
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static R error() { //请求不成功的状态码
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

}

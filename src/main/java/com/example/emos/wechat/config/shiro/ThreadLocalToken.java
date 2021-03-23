package com.example.emos.wechat.config.shiro;


import org.springframework.stereotype.Component;

@Component
public class ThreadLocalToken {
    private ThreadLocal<String> local =new ThreadLocal();
    public void setToken(String Token){
        local.set(Token);
    }
    public String getToken(){
        return  local.get();
    }

    public void clear(){
        local.remove();
    }

}

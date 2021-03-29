package com.example.emos.wechat.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

//@Transactional
public interface UserService {
    public int registerUser(String registerCode,String code,String nickname,String photo);
    public Set<String> searchUserPermissions(int userId);

}

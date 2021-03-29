package com.example.emos.wechat.db.dao;

import com.example.emos.wechat.db.pojo.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Set;

@Component //添加Component注解之后UserServiceImpl
@Mapper
public interface TbUserDao {
    public boolean haveRootUser();
    public int insert(HashMap param);
    public Integer searchIdByOpenId(String openId);
    public Set<String> searchUserPermissions(int userId);
}

package com.example.emos.wechat.config.shiro;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class JwtUtil {

    @Value("${emos.jwt.secret}")
    private String secret;

    @Value("&{emos.jwt.expire}")
    private String expire;

    public String creatToken(int useID){
        //定义token过期时间
        Date date = DateUtil.offset(new Date(), DateField.DAY_OF_YEAR,5);
        //传递密钥
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTCreator.Builder builder = JWT.create();
        String token = builder.withClaim("useID",useID
        ).withExpiresAt(date).sign(algorithm);
        return  token;
    }

    public int getUserId(String token){
        //解码，获取userId
        DecodedJWT jwt = JWT.decode(token);
        int userId = jwt.getClaim("userID").asInt();
        return userId;
    }


    public  void verifierToken(String token){
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTVerifier verifier = JWT.require(algorithm).build();
        verifier.verify(token);//验证失败会有runtime的异常

    }


}

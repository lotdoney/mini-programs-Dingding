package com.example.emos.wechat.controller;


import com.example.emos.wechat.common.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api("测试接口")
public class TestController{
    @GetMapping("/sayHello")
    @ApiOperation("测试方法")

    public R sayHello(){
        return R.ok().put("message","Helloword");
    }

}

